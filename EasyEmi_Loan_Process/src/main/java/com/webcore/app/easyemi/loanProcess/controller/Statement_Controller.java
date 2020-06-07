package com.webcore.app.easyemi.loanProcess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;
import com.webcore.app.easyemi.loanProcess.service.Statement_Service;

@CrossOrigin("*")
@RestController
public class Statement_Controller {
	
	@Autowired 
	Statement_Service ss;
	
	
	@RequestMapping(value = "/loanStatementpostdata",method = RequestMethod.POST)
	public LoanAccountStatement postdata(@RequestBody LoanAccountStatement lcs)
	{
		
		ss.savedata(lcs);
		
		return lcs;	
		
		
	}
	

	 @RequestMapping(value = "/getScdata/{customerId}",method = RequestMethod.GET) 
	  public CustomerDetails getCustomerdata(@PathVariable("customerId") int customerId)
	   {
		 CustomerDetails cd = ss.getCustData(customerId);
	     return cd;
	  
	  }
	@RequestMapping(value = "/loanStatementgetdata", method = RequestMethod.GET)
	public List getSatementdata()
	{
		List li=ss.displayAll();
		System.out.println("get data");
		
		return li;
		
	}
	
	@RequestMapping(value = "/deleteloanstatement/{loanStatementId}", method = RequestMethod.DELETE)
	public List deletedata(@PathVariable("loanStatementId") int id)
	{ 
		ss.deletedata(id);
		System.out.println("delete data");
		
		List li=ss.displayAll();
		return li;
		
	}
	
	@RequestMapping(value="/updateloanstatement",method= RequestMethod.PUT)
	public List updatedata(@RequestBody LoanAccountStatement lcs)
	{
		ss.updatedata(lcs);
		System.out.println("update data");
		List li=ss.displayAll();
		return li;
	}

}
