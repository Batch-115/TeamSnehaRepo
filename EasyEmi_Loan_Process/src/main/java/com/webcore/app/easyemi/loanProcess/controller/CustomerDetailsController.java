package com.webcore.app.easyemi.loanProcess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;
import com.webcore.app.easyemi.loanProcess.service.CustomerDetails_Service;

@CrossOrigin("*")
@RestController
public class CustomerDetailsController {

	@Autowired
	CustomerDetails_Service cds;
	
	@RequestMapping(value = "/cdpostdata",method = RequestMethod.POST)
	public CustomerDetails postdata(@RequestBody CustomerDetails cd)
	{
		
		cds.savedata(cd);
		
		return cd;	
		
		
	}
	
	
	@RequestMapping(value = "/cdgetAlldata", method = RequestMethod.GET)
	public List getCustomerDetails()
	{
		List li=cds.displayAll();
		System.out.println("get data");
		
		return li;
		
	}
	
}
