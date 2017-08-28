package com.local.test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.test.model.AgeIn;
import com.local.test.model.User;
import com.local.test.persistence.GenericMapper;
import com.local.test.persistence.UserMapper;
import com.local.test.service.UserService;
import com.test.local.response.Response;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private GenericMapper gm;
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
	
	public List<Map<String, Object>> genericSearch(String query){
		Map<String, Object> map = new HashMap();
		map.put("query", query);
		return gm.genericSearch(map);
	}
	
	public Response insertQuery(String query) {
		Map<String, Object> map = new HashMap();
		map.put("query", query);
		Response response = new Response(true, "Succes");
		try {
			gm.genericInsert(map);
		}catch(Exception e) {
			response = new Response(false, "Error to insert valuses");
		}
		return response;
	}
}
