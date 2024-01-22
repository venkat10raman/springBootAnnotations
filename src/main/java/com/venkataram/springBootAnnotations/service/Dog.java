package com.venkataram.springBootAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {

	@Override
	public String sounds() {
		return "Dog goes bow bow bow....";
	}

}
