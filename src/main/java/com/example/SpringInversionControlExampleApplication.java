package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.service.Mobiles;
import com.example.service.MobilesConfig;

@SpringBootApplication
public class SpringInversionControlExampleApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringInversionControlExampleApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		Mobiles mbl = context.getBean("getOnePlusObject", Mobiles.class);
		mbl.getModelAndColor();
	}

}
