package com.example.demo.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

//public interface UserRepository extends JpaRepository<User, Integer>{
//	Optional<User> findByUserId(String userId);
//}

public interface UserRepository extends JpaRepository<User, Long>{
	// 추후 삭제 필요
	Optional<User> findById(String username);
	Optional<User> findByUserId(Integer userId);
}