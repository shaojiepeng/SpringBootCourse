package com.ajay.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ajay.demo.model.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM T_USER")
	List<User> findAll();

	@Select("SELECT * FROM T_USER WHERE NAME = #{name}")
	User findByName(@Param("name") String name);
	
	@Insert("INSERT INTO T_USER(NAME, PASS) VALUES(#{name}, #{pass})")
    int save(@Param("name") String name, @Param("pass") String pass);
	
}
