package com.venkataram.springBootAnnotations.service;

public class SamsungMobile implements Mobile {

	@Override
	public String brand() {
		return "Hello!! I am calling from Samsung";
	}

}
