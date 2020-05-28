package com.webcore.app.easyemi.service;

import java.util.List;

import com.webcore.app.easyemi.model.CustomerCibil;
import com.webcore.app.easyemi.model.CustomerLoanDetails;
import com.webcore.app.easyemi.model.LoanCalculation;

public interface Service {

//	public void saveLoanCalculation(LoanCalculation lc);
//	public List<LoanCalculation>getData();
	public void saveCibilData(CustomerCibil customercibil);
	public CustomerCibil getCustomerCibilData(int cibilId);
	public void saveLoanDetails(CustomerLoanDetails customerloandetails);
	public CustomerLoanDetails getLoanDetails(int loanDetailId);
	
}
