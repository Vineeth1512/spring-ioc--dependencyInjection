package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Color;
import com.example.beans.Iphone;
import com.example.beans.OnePlus;
import com.example.service.Mobiles;

@Configuration
public class MobilesConfig {

	

	
	@Bean
	public Mobiles getIponeObject(Color getColor) {
		return new Iphone(getColor);
	}
	
	@Bean
	public Mobiles getOnePlusObject(Color getColor) {
		return new OnePlus(getColor);
	}

	
	@Bean
	public Color getColor() {
		return new Color();
	}

}
