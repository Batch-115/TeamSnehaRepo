package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;

public interface Statement_Service {

	void savedata(LoanAccountStatement lcs);

	CustomerDetails getCustData(int customerId);

	List displayAll();

	void deletedata(int id);

	void updatedata(LoanAccountStatement lcs);

}
