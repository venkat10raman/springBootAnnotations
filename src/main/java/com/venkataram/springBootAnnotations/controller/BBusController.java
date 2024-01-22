package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Bus;

@RestController
@RequestMapping("/bus")
public class BBusController {

	@Autowired
	private Bus volvoBus;//byName
	
	@Autowired
	private Bus tataBus;//byName

	@Qualifier("volvoBus")
	@Autowired
	private Bus bus;//byType

	@GetMapping
	public String driveBus() {
		System.out.println(tataBus.driveBus());
		System.out.println(volvoBus.driveBus());
		return bus.driveBus();
	}

}
