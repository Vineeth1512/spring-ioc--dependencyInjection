package com.example.beans;

import com.example.service.Mobiles;

public class Iphone implements Mobiles {
	
	Color color;
	public Iphone() {
		System.out.println("From Iphone constructor ");
	}
	public Iphone(Color color){
		this.color=color;
		
	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model : 14 pro");
		color.getColorIphone();

	}

}
