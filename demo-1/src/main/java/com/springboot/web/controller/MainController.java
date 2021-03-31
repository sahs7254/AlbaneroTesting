package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
	@RequestMapping("/")
        public String home()
        {
		System.Out>Println("This is home page");
        	return "home";
        }
}
