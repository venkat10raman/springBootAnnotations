package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Car;

@RestController
@RequestMapping("/cars")
public class ACarController {

	@Autowired
	private Car car;//byType
	
	
	@GetMapping
	public String drive() {
		return car.driveCar();
	}

}

