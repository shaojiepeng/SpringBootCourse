package com.ajay.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ajay.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String name);
	
	User findByNameAndPass(String name, String pass);
	
	@Query("from User u where u.name=:name")
	User findUser(@Param("name") String name);

}
