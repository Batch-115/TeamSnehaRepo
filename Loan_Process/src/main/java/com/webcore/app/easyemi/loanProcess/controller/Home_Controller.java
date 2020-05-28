package com.webcore.app.easyemi.loanProcess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.model.CustmerDetails;
import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;
import com.webcore.app.easyemi.loanProcess.service.Home_Service;

@RestController
public class Home_Controller {
	
	@Autowired
	Home_Service hs;
	
	@RequestMapping(value = "/loanStatementpostdata",method = RequestMethod.POST)
	public LoanAccountStatement postdata(@RequestBody LoanAccountStatement lcs)
	{
		
		hs.savedata(lcs);
		
		return lcs;	
		
		
	}
	
	@RequestMapping(value = "/loanStatementgetdata", method = RequestMethod.GET)
	public LoanAccountStatement getdata()
	{
		CustmerDetails cd=new CustmerDetails();
		cd.setCustmerId(1);
		cd.setCusterName("Ram");
		cd.setCustermerAddress("ngp");
		
		LoanAccountStatement ls=new LoanAccountStatement();
		ls.setLoanStatementId(1);
		ls.setTenor(8);
		ls.setDownPayment(500);
		ls.setFirstInstallmentDueDate("25/05/2020");
		ls.setInterestStartDate("25/05/2020");
		ls.setLastInstallmentDueDate("25/011/2020");
		ls.setLoanAmountWithRateOfInterest(44000);
		ls.setProcessingFees(1450);
		ls.setLoanDisbursalDate("25/05/2020");
		ls.setCsd(cd);
		
		return ls;
		
	}
	
	@RequestMapping(value = "/deleteloanstatement/{loanStatementId}", method = RequestMethod.DELETE)
	public void deletedata(@PathVariable("loanStatementId") int id)
	{ 
		hs.deletedata(id);
		
	}
	
	@RequestMapping(value="/updateloanstatement/{loanStatementId}")
	public void updatedata(@PathVariable("loanStatementId") int id,@RequestBody LoanAccountStatement lcs)
	{
		hs.updatedata(lcs);
	}
	

}
