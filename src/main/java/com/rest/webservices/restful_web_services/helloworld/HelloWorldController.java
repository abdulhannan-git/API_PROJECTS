package com.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/my-name")
	public String name() {
		return "Abdul Hannan";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/my-bean")
	public MyBean myBean() {
		return new MyBean("My  first Bean");
	}
}