package com.webcore.app.easyemi.loanProcess.service;

import com.webcore.app.easyemi.loanProcess.model.CustomerCibil;
import com.webcore.app.easyemi.loanProcess.model.CustomerLoanDetails;

public interface LoanDetailsAndCibilService {
	
	public void saveCibilData(CustomerCibil customercibil);
	public CustomerCibil getCustomerCibilData(int cibilId);
	public void updateCibilData(CustomerCibil customercibil);
	public void deleteCibilData(int cibilId);
	public void saveLoanDetails(CustomerLoanDetails customerloandetails);
	public CustomerLoanDetails getLoanDetails(int loanDetailId);
	public void updateLoanDetails(CustomerLoanDetails customerloandetails);
	public void deleteLoanDetails(int loanDetailId);

}
