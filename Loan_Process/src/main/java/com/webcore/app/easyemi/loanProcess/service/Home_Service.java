package com.webcore.app.easyemi.loanProcess.service;

import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;

public interface Home_Service {

	void savedata(LoanAccountStatement lcs);

	void deletedata(int id);

	void updatedata(LoanAccountStatement lcs);

}
