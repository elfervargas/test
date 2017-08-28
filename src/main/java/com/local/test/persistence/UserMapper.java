package com.local.test.persistence;

import java.util.List;
import java.util.Map;

import com.local.test.model.AgeIn;
import com.local.test.model.User;

public interface UserMapper {

	int addUser(User user);

	List<Map<String, Object>> allUsers();

	List<Map<String, Object>> ageIn(AgeIn ageIn);
	
	com.local.test.domain.User searchById(int id);
}
