package com.randika.src;

import com.randika.src.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
                ApplicationContext context =      SpringApplication.run(SpringProjectApplication.class, args);
                
                GreetingController greetingController = (GreetingController) context.getBean("greetingController");
                
                greetingController.sayHello();
	}

}

