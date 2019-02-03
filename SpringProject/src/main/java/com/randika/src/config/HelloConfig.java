/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randika.src.config;

import com.randika.src.servicers.HelloWorldEnglish;
import com.randika.src.servicers.HelloWorldFactory;
import com.randika.src.servicers.HelloWorldGerman;
import com.randika.src.servicers.HelloWorldService;
import com.randika.src.servicers.HelloWorldSpanish;
import com.randika.src.servicers.HelloWorldSrilankan;
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
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }
    
    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        
        return factory.createHelloworldService("en");
        
    }
   
    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return  factory.createHelloworldService("sp");
    }
    
    @Bean
    @Profile("srilankan")
    public HelloWorldService helloWorldServiceSrilankan(HelloWorldFactory factory){
        return factory.createHelloworldService("sl");
    }
    
    @Bean
    @Profile("german")
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
        return factory.createHelloworldService("gr");
        }
    
}
