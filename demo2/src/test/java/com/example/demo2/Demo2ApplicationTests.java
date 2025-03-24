package com.example.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo2.domain.User;

@SpringBootTest
class Demo2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private User user;

	@Test
	void propTest(){
		System.out.println("Executing propTest()");
		System.out.println(user);
	}



}
