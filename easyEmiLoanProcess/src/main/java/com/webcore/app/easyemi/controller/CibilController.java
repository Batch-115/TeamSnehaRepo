package com.webcore.app.easyemi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.model.CustomerCibil;
import com.webcore.app.easyemi.service.Service;

@RestController
@RequestMapping("/cibil")
public class CibilController {
	@Autowired
	Service cibilservice;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public CustomerCibil saveCibilData(@RequestBody CustomerCibil customercibil) {
		cibilservice.saveCibilData(customercibil);
		return customercibil;		
	}
	@RequestMapping(value = "/get/{cibilId}",method = RequestMethod.GET)
	public CustomerCibil getCibilData(@PathVariable("cibilId")int cibilId) {
		return cibilservice.getCustomerCibilData(cibilId);
	}

}
