package com.jwt.jwtExample.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.jwtExample.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"ritik agarwal","ritik.agarwal@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"harsh agarwal","harsh.agarwal@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"mansi agarwal","mansi.agarwal@gmail.com"));

	}
	public List<User> getUser(){
		return this.store;
	}
}
