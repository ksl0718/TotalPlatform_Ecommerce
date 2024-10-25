package com.example.demo.User;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository ur;
	
	//예외처리 : 존재하지 않는 유저
		public User getUser(String userId) throws nosignException {
			Optional<User> user = this.ur.findByUserId(userId);
			if(user.isPresent()) {
				return user.get();
			}
			else {
				throw new nosignException("존재하지 않는 유저입니다");
			}
		}

}
