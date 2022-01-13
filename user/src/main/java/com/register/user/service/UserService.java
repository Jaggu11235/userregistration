package com.register.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.register.user.entity.User;
import com.register.user.validate.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);

}
