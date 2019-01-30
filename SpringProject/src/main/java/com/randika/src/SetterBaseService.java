/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randika.src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author randika-lakmal
 */

@Component
public class SetterBaseService {
    
    private HelloWorldService helloWorldService;

    @Autowired
    private void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    
    public void getMessage(){
        helloWorldService.sayHello();
    }
    
}
