package com.webcore.app.easyemi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.model.CustomerLoanDetails;
import com.webcore.app.easyemi.service.Service;

@RestController
@RequestMapping("/loan-details")
public class LoanDetailsController {
	
	@Autowired
	Service loanDetailsservice;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public CustomerLoanDetails saveLoanDetails(@RequestBody CustomerLoanDetails loandetails){
		loanDetailsservice.saveLoanDetails(loandetails);
		return loandetails;		
	}
	
	@RequestMapping(value = "/get/{loanDetailId}",method = RequestMethod.GET)
	public CustomerLoanDetails getLoanDetails(@PathVariable("loanDetailId")int loanDetailId) {
		
		return loanDetailsservice.getLoanDetails(loanDetailId);
		
	}

}
