package com.venkataram.springBootAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class VolvoBus implements Bus {

	@Override
	public String driveBus() {
		return "Travelling in Volvo Bus ...";
	}

}
