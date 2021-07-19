package com.example.demo.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Component
//@Lazy

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Mobileplan {
     int id;
     String planname;
     double value;
     long validity; 
     public Mobileplan() {
    	 super();
    	 System.out.println("mobileplan");
     }
	
}
