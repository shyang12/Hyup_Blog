package com.yang.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.blog.model.User;
import com.yang.blog.repository.UserRepository;

import jakarta.transaction.Transactional;

// 스프링이 컴포넌트를 스캔을 통해서 Bean에 등록을 해줌. loc를 해준다
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public int 회원가입(User user) {
		try {
			userRepository.save(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("UserService : 회원가입() : " + e.getMessage());
		}
		return -1;
	}
}
