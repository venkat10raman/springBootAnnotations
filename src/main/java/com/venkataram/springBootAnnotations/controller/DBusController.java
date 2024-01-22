package com.venkataram.springBootAnnotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Bus;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("bus/cia")
@RequiredArgsConstructor
public class DBusController {

	private final Bus tataBus;

	@GetMapping
	public String driveBus() {
		return tataBus.driveBus();
	}

}
