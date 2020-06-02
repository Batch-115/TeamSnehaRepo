package com.webcore.app.easyemi.loanProcess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.model.CustomerCibil;
import com.webcore.app.easyemi.loanProcess.service.LoanDetailsAndCibilService;




@CrossOrigin
@RestController
@RequestMapping("/cibil")
public class CibilController {

	@Autowired
	LoanDetailsAndCibilService cibilservice;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public CustomerCibil saveCibilData(@RequestBody CustomerCibil customercibil) {
		cibilservice.saveCibilData(customercibil);
		return customercibil;		
	}
	@RequestMapping(value = "/get/{cibilId}",method = RequestMethod.GET)
	public CustomerCibil getCibilData(@PathVariable("cibilId")int cibilId) {
		return cibilservice.getCustomerCibilData(cibilId);
	}
	@RequestMapping(value = "/update/{cibilId}",method = RequestMethod.PUT)
	public void updateCibilData(@PathVariable("cibilId")int cibilId,CustomerCibil customercibil) {
		cibilservice.updateCibilData(customercibil);
	}
	@RequestMapping(value = "/delete/{cibilId}",method = RequestMethod.DELETE)
	public void deleteCibilData(int cibilId) {
		cibilservice.deleteCibilData(cibilId);
	}
}
