package com.venkataram.springBootAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkataram.springBootAnnotations.service.Mobile;

@RestController
@RequestMapping("mobile")
public class MobileController {
	
	private Mobile constructorMobile;
	
	private Mobile setterMobile;
	
	private Mobile setterMobileWithoutQualifier;
	
	/*
	 * construction injection has no effect on the required flag passed
	 * at the timeof compilation if required bean is not found
	 *  application stops
	 */
	@Autowired(required = false)
	public MobileController(@Qualifier("appleMobile") Mobile cm) {
		this.constructorMobile = cm;
	}
	
	@GetMapping
	public String ring() {
		System.out.println("Constructor Mobile is ::: ");
		System.out.println(constructorMobile.brand());
		System.out.println("SetterMobileWithoutQualifier Mobile is ::: ");
		System.out.println(setterMobileWithoutQualifier.brand());
		System.out.println("Setter Mobile is ::: ");
		System.out.println(setterMobile.brand());
		return constructorMobile.brand();
	}

	@Autowired(required = false)
	public void setSetterMobile(@Qualifier("samsungMobile") Mobile setterMobile) {
		this.setterMobile = setterMobile;
	}
	
	@Autowired(required = false)
	public void setSetterMobileWithoutQualifier(Mobile smwoq) {
		this.setterMobileWithoutQualifier = smwoq;
	}
	
}
