/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randika.src.config;

import com.randika.src.servicers.HelloWorldEnglish;
import com.randika.src.servicers.HelloWorldService;
import com.randika.src.servicers.HelloWorldSpanish;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author randika-lakmal
 */
@Configuration
public class HelloConfig {
    
    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        
        return new HelloWorldEnglish();
        
    }
    
    
    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return  new HelloWorldSpanish();
    }
    
}
