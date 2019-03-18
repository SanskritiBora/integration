package com.Spring.starter.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello";
	}

}
