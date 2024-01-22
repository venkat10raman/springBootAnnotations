package com.venkataram.springBootAnnotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Cat implements Animal {

	@Override
	public String sounds() {
		return "Cat goes pur pur pur....";
	}

}
