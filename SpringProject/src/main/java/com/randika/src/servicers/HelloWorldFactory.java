/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randika.src.servicers;

/**
 *
 * @author randika-lakmal
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloworldService(String language){
            
            HelloWorldService service = null;
            
         switch(language){
             case "en":
                 service =   new HelloWorldEnglish();
                 break;
             case "sl":
                 service =  new HelloWorldSrilankan();
                 break;
             case "gr":
                 service =  new HelloWorldGerman();
                 break;
             case "sp":
                 service = new HelloWorldSpanish();
                 break;
         }
        
        
        return service;
        
    }
    
}
