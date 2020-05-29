package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import com.webcore.app.easyemi.loanProcess.model.EMICardGeneration;
import com.webcore.app.easyemi.loanProcess.model.EmiDetails;

public interface Home_Service {

	void saveemidata(EmiDetails emidata);

	List<EmiDetails> getemidetails();

	void savecardgenrateddata(EMICardGeneration ecg);

	void deletedata(int id);

	void deletecarddata(int id);

	void updateemidata(EmiDetails emidata);

	EmiDetails getsingleemidetails(int id);

	EMICardGeneration getsinglecardemidetails(int id);

	void updatecardemidata(EMICardGeneration emidata);

	List<EMICardGeneration> getcardemidetails();



}
