package com.local.test.service;

import com.local.test.model.Test;
import com.local.test.util.Response;

public interface TestService {
	Response saveTest(Test test);
}
