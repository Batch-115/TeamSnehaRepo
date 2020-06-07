package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.webcore.app.easyemi.loanProcess.model.CustomerCibil;
import com.webcore.app.easyemi.loanProcess.model.CustomerLoanDetails;

public interface LoanDetailsAndCibilService {
	
	public void saveCibilData(CustomerCibil customercibil);
	public List<CustomerCibil> getCustomerCibilData();
	public void updateCibilData(CustomerCibil customercibil);
	public void deleteCibilData(int cibilId);
	public void saveLoanDetails(CustomerLoanDetails customerloandetails);
	public List<CustomerLoanDetails> getLoanDetails();
	public void updateLoanDetails(CustomerLoanDetails customerloandetails);
	public void deleteLoanDetails(int loanDetailId);

}
