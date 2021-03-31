package com.springboot.web.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellowController {
	@RequestMapping("/hello")
public String sayhi()
{
	
	return "Hi";
}
}
