package com.randika.src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context =   SpringApplication.run(SpringProjectApplication.class, args);
//		
//		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
//		helloWorld.sayHello();

//                             This is Contstructor Way of DI
//                            InjectedByContstructorService injectedByContstructorService = (InjectedByContstructorService)
//                                    context.getBean("injectedByContstructorService");
//                            
//                           injectedByContstructorService.getMessage();

//                           This is Setter Way of DI
    
                        SetterBaseService setterBaseService = (SetterBaseService) context.getBean("setterBaseService");
                        setterBaseService.getMessage();


	}

}

