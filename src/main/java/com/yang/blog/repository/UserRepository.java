package com.yang.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yang.blog.model.User;

// DAO
// 자동으로 bean등록이 된다.
// @Repository // 생략 가능하다
public interface UserRepository extends JpaRepository<User, Integer> {

}
