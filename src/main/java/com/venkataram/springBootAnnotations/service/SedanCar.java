package com.venkataram.springBootAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class SedanCar implements Car {

	@Override
	public String driveCar() {
		return "Driving Sedan Car...";
	}

}
