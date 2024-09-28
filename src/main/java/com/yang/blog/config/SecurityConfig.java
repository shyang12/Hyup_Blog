package com.yang.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // IoC
public class SecurityConfig {

	@Bean
	BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http
				.csrf().disable()
				.authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
				.requestMatchers("/", "/auth/**", "/js/**", "/css/**", "image/**")
				.permitAll()
				.anyRequest()
				.authenticated())
				.formLogin(formLogin -> formLogin
				.loginPage("/auth/signin"));
		return http.build();
	}

}