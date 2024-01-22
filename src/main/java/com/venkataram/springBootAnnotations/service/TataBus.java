package com.venkataram.springBootAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class TataBus implements Bus {

	@Override
	public String driveBus() {
		return "Travelling in Tata Bus ....";
	}

}
