/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randika.src.controllers;

import com.randika.src.servicers.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @author randika-lakmal
 */

//@Controller
public class GreetingController {
    
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceSrilankan;
    
    @Autowired
    private void setHelloWorldService(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }
    
    @Autowired
    @Qualifier("srilankan")
    public void setHelloWorldServiceSrilankan(HelloWorldService helloWorldServiceSrilankan){
        this.helloWorldServiceSrilankan = helloWorldServiceSrilankan;
    }
    
    public String sayHello(){
        String greeting  = helloWorldService.getGreeting();
        
        System.out.println(greeting);
        System.out.println(this.helloWorldServiceSrilankan.getGreeting());
        return greeting;
    }
    
}
