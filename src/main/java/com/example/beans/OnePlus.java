package com.example.beans;

import com.example.service.Mobiles;

public class OnePlus implements Mobiles {

	Color color;

	OnePlus() {
		System.out.println("from OnePlus constructor  injection");
	}

	public OnePlus(Color color) {
		this.color = color;

	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model : Oneplues +");
		color.getColorOnePlus();
	}

}
