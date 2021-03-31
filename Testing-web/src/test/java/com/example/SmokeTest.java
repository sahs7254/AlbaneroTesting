package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class SmokeTest {
	
	@Autowired
    private HomeControlller controller;
	
	
	@Test
	void contextLoads() 
	{
		assertThat(controller).isNotNull();
	}


}
