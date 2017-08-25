package com.local.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.local.test.model.Test;
import com.local.test.service.TestService;
import com.local.test.util.Response;

@RestController
@RequestMapping(value = "test")
public class TestController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping(value = "test1", method = RequestMethod.POST)
	public Object test(@RequestBody Test test) {
		Response response = service.saveTest(test);
		return response;
	}
}
