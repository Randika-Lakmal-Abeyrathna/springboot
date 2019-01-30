package com.randika.src;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements HelloWorldService {

	public void sayHello() {
		System.out.println("Hello World");
	}
	
}
