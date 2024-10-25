package com.example.demo.CsQuestion;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface CsQuestionUserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findById(String id);

}
