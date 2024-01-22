package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.annotation.BusQualifier;
import com.venkataram.springBootAnnotations.service.Bus;

@RestController
@RequestMapping("/bus/ca")
public class FBusController {

	//byName
	@Autowired
	private Bus volvoBus;

	//byName
	@Autowired
	private Bus tataBus;

	//Custom Qualifier Annotation
	@BusQualifier("volvoBus")
	@Autowired
	private Bus bus;

	// Constructor Injection
	private final Bus constructorBus;
	
	@Autowired
	public FBusController(@Qualifier("volvoBus") Bus constructorBus) {
		this.constructorBus = constructorBus;
	}
	
	//Setter Injection
	private Bus setterBus;

	@GetMapping
	public String driveBus() {
		System.out.println(tataBus.driveBus());
		System.out.println(volvoBus.driveBus());
		
		System.out.print("Constructor Bus is :::");
		System.out.println(constructorBus.driveBus());
		System.out.print("Setter Bus is :::");
		System.out.println(setterBus.driveBus());
		return bus.driveBus();
	}

	@Autowired
	public void setSetterBus(@Qualifier("tataBus") Bus setterBus) {
		this.setterBus = setterBus;
	}

}
