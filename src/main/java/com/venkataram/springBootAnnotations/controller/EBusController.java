package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Bus;

@RestController
@RequestMapping("bus/si")
public class EBusController {
	
	private Bus bus;
	private Bus tataBus;
	private Bus volvoBus;
	
	@GetMapping
	public String driveBus() {
		System.out.println(tataBus.driveBus());
		System.out.println(volvoBus.driveBus());
		return bus.driveBus();
	}

	@Autowired
	public void setBus(@Qualifier("volvoBus") Bus bus) {
		this.bus = bus;
	}

	@Autowired
	public void setTataBus(Bus tataBus) {
		this.tataBus = tataBus;
	}

	@Autowired
	public void setVolvoBus(Bus volvoBus) {
		this.volvoBus = volvoBus;
	}
	
}
