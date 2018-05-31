package com.javatpoint;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

	 @RequestMapping("/hello")  
	    public String hello(){  
	        return"Hello!";  
	    }  
}
