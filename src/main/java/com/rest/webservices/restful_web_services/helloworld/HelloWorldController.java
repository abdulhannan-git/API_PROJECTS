package com.rest.webservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

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

	@GetMapping(path = "/my-bean/path-variabale/{name}")
	public MyBean myBeanPathVariable(@PathVariable String name) {
		return new MyBean(String.format("Hello world, %s", name));
	}

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
		// return "Hello World";
	}

	// Example: 'en' - English (Good Morning)
	// Example: 'nl' - Dutch (Goedemorgen)
	// Example: 'fr' - French (Bonjour)
	// Example: 'de' - Deutsch (Guten Morgen)
}