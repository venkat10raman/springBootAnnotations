package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Animal;

@RestController
@RequestMapping("animal")
public class GAnimalController {
	
	@Autowired
	private Animal animal;
	
	@GetMapping
	public String animalSound() {
		return animal.sounds();
	}

}
