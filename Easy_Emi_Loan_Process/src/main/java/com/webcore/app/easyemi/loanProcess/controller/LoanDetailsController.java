package com.webcore.app.easyemi.loanProcess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.model.CustomerLoanDetails;
import com.webcore.app.easyemi.loanProcess.service.LoanDetailsAndCibilService;


@CrossOrigin
@RestController
@RequestMapping("/loan-details")
public class LoanDetailsController {

	@Autowired
	LoanDetailsAndCibilService loanDetailsservice;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public CustomerLoanDetails saveLoanDetails(@RequestBody CustomerLoanDetails loandetails){
		loanDetailsservice.saveLoanDetails(loandetails);
		return loandetails;		
	}
	
	@RequestMapping(value = "/get/{loanDetailId}",method = RequestMethod.GET)
	public CustomerLoanDetails getLoanDetails(@PathVariable("loanDetailId")int loanDetailId) {
		
		return loanDetailsservice.getLoanDetails(loanDetailId);
		
	}
	@RequestMapping(value = "/update/{loanDetailId}",method = RequestMethod.PUT)
	public void updateLoanDetails(@PathVariable("loanDetailId")int loanDetailId,@RequestBody CustomerLoanDetails loandetails) {
		loanDetailsservice.updateLoanDetails(loandetails);
	}
	@RequestMapping(value = "/delete/{loanDetailId}",method = RequestMethod.DELETE)
	public void deleteLoanDetails(@PathVariable("loanDetailId")int loanDetailId) {
		loanDetailsservice.deleteLoanDetails(loanDetailId);
	}

}
