package com.local.test.service.impl;

import org.springframework.stereotype.Service;

import com.local.test.model.Test;
import com.local.test.service.TestService;
import com.local.test.util.Response;

@Service
public class TestServiceImpl implements TestService {

	public Response saveTest(Test test) {
		return new Response(true, "ok");
	}

}
