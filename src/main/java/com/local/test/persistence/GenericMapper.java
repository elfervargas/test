package com.local.test.persistence;

import java.util.List;
import java.util.Map;

public interface GenericMapper {
	List<Map<String, Object>> genericSearch(Map map);
	void genericInsert(Map map);
}
