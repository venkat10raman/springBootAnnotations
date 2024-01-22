package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Bus;

@RestController
@RequestMapping("bus/ci")
public class CBusController {
	
	private final Bus bus;
	
	@Autowired
	public CBusController(@Qualifier("volvoBus") Bus bus) {
		this.bus = bus;
	}
	
	@GetMapping
	public String driveBus() {
		return bus.driveBus();
	}

}
