package com.venkataram.springBootAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class AppleMobile implements Mobile {

	@Override
	public String brand() {
		return "Hello! I am calling from Apple....";
	}

}
