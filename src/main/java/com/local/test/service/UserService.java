package com.local.test.service;

import java.util.List;
import java.util.Map;

import com.local.test.model.AgeIn;
import com.local.test.model.User;
import com.test.local.response.Response;

public interface UserService {
	Response addUser(User user);
	List<Map<String, Object>> allUsers();
	List<Map<String, Object>> ageIn(AgeIn ageIn);
}
