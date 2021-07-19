package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Mobileplan;

@SpringBootApplication
public class MobilePlanServiceApplication {

	public static void main(String[] args) {
		
//		in spring  default beams are eagerly created 
//		and we can also make them lazyily using @Lazy
//		beans are single ton method(only one object)
//		if they are not single ton they are prototype
//		scope for singleton to prototype is done by using tha annotation @scope("prototype")
	ConfigurableApplicationContext ctx =	SpringApplication.run(MobilePlanServiceApplication.class, args);
//	Mobileplan plan = ctx.getBean("mobileplan",Mobileplan.class);
//	System.out.println(ctx);
	
	
	
	
	Mobileplan plan1 = ctx.getBean("mobileplan",Mobileplan.class);
	System.out.println(plan1);
	
	Mobileplan plan2 = ctx.getBean("mobileplan",Mobileplan.class);
	System.out.println(plan2);
	
	System.out.println(ctx.isSingleton("mobileplan"));
	
	System.out.println(ctx.isPrototype("mobileplan"));
	}
	
	@Bean
	public Mobileplan prepaid() {
		return new Mobileplan(200,"plan399",400,28);
	}
	
	@Bean
	public Mobileplan postpaid() {
		return new Mobileplan(300,"monthly",900,28);
	}

}
