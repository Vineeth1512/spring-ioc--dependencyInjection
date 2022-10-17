package com.example.service;

public class Iphone implements Mobiles {
	Iphone() {
		System.out.println("From Iphone constructor ");
	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model : 14 pro");

	}

}
