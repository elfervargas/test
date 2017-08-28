package com.local.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.local.test.model.AgeIn;
import com.local.test.model.User;
import com.local.test.service.UserService;
import com.test.local.response.Response;
import com.test.local.response.ResponseFactory;

@RestController
@RequestMapping(value = "user")
public class TestController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public Object addUser(@RequestBody User user) {
		Response response = service.addUser(user);
		return response;
	}
	
	@RequestMapping(value = "all", method = RequestMethod.POST)
	public Object allUsers(){
		List<Map<String, Object>> users = service.allUsers();
		if(users.isEmpty())
			return ResponseFactory.unsuccessfulResponse("nothing to find");
		Map<String, Object> data = new HashMap();
		data.put("data", data);
		//return ResponseFactory.successfulResponse(data, "ok");
		return users;
	}
	
	@RequestMapping(value = "ageIn", method = RequestMethod.POST)
	public Object ageIn(@RequestBody AgeIn ageIn){
		List<Map<String, Object>> users = service.ageIn(ageIn);
		if(users.isEmpty())
			return ResponseFactory.unsuccessfulResponse("nothing to find");
		Map<String, Object> data = new HashMap();
		data.put("data", data);
		return ResponseFactory.successfulResponse(data, "ok");
	}
	
	@RequestMapping(value = "searchById", method = RequestMethod.POST)
	public Object searById(@RequestBody int id) {
		com.local.test.domain.User user = service.searchById(id);
		return user;
	}
}
