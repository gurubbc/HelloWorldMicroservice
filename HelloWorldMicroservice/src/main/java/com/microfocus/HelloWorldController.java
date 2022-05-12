package com.microfocus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String sayInfo()
	{
		String msg="Welcome to my first microservice....the following are the various URIs available in this microservice";
		msg=msg+"<br><a href='hello'>Hello</a>";
		msg=msg+"<br><a href='welcome'>Welcome</a>";
		return msg;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello()
	{
		return "Hello World Microservice";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String sayWelcome()
	{
		return "Welcome to  World Microservice";
	}
}
