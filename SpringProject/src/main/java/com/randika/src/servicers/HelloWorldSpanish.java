/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randika.src.servicers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author randika-lakmal
 */

//@Component
//@Profile("spanish")
public class HelloWorldSpanish  implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Hola Mundo";
    }
    
    
    
}
