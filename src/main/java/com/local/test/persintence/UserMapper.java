package com.local.test.persintence;

import java.util.List;
import java.util.Map;

//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Select;

import com.local.test.model.AgeIn;
import com.local.test.model.User;

public interface UserMapper {
//	@Insert("INSERT INTO test.user(name, age, sex)" + "VALUES(#{name},#{age}, #{sex})")
	int addUser(User user);

//	@Select("SELECT * FROM test.user")
	List<Map<String, Object>> allUsers();

//	@Select("SELECT * FROM test.user where age between #{min} and #{max}")
	List<Map<String, Object>> ageIn(AgeIn ageIn);
}
