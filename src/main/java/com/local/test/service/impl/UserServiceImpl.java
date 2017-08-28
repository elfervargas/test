package com.local.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.test.model.AgeIn;
import com.local.test.model.User;
import com.local.test.persistence.UserMapper;
import com.local.test.service.UserService;
import com.test.local.response.Response;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;

	public Response addUser(User user) {
		mapper.addUser(user);
		return new Response(true, "Added user");
	}

	public List<Map<String, Object>> allUsers() {
		return mapper.allUsers();
	}

	public List<Map<String,Object>> ageIn(AgeIn ageIn) {
		return mapper.ageIn(ageIn);
	}
	
	public com.local.test.domain.User searchById(int id){
		return mapper.searchById(id);
	}
}
