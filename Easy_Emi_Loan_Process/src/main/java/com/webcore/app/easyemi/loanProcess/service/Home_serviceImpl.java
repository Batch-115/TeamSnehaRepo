package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.EMICardGeneration;
import com.webcore.app.easyemi.loanProcess.model.EmiDetails;
import com.webcore.app.easyemi.loanProcess.repository.Emi_Home_repository;
import com.webcore.app.easyemi.loanProcess.repository.EmiCardGeneration_Home_repository1;

@Service
public class Home_serviceImpl implements Home_Service {
@Autowired 
Emi_Home_repository hr;
@Autowired
EmiCardGeneration_Home_repository1 hrf;
	@Override
	public void saveemidata(EmiDetails emidata) {
		// TODO Auto-generated method stub
		hr.save(emidata);
	}
	@Override
	public List<EmiDetails> getemidetails() {
		// TODO Auto-generated method stub
	List<EmiDetails> list=	hr.findAll();
		return list;
	}
	@Override
	public void savecardgenrateddata(EMICardGeneration ecg) {
		// TODO Auto-generated method stub
		System.out.println(ecg.getCurrentMaxloanLimit());
		System.out.println(ecg.getEmiCardId());
		hrf.save(ecg);
	}
	@Override
	public void deletedata(int id) {
		EmiDetails deletedata=hr.findById(id).get();
		hr.delete(deletedata);
	}
	@Override
	public void deletecarddata(int id) {
	EMICardGeneration deletedata=hrf.findById(id).get();
		hrf.delete(deletedata);
	}
	@Override
	public void updateemidata(EmiDetails emidata) {
		// TODO Auto-generated method stub
		hr.save(emidata);
	}
	@Override
	public EmiDetails getsingleemidetails(int id) {
		// TODO Auto-generated method stub
	EmiDetails data=	hr.findById(id).get();
		return data;
	}
	@Override
	public EMICardGeneration getsinglecardemidetails(int id) {
		// TODO Auto-generated method stub
		EMICardGeneration data=	hrf.findById(id).get();
		return data;
	}
	@Override
	public void updatecardemidata(EMICardGeneration emidata) {
		// TODO Auto-generated method stub
		hrf.save(emidata);
	}
	@Override
	public List<EMICardGeneration> getcardemidetails() {
		// TODO Auto-generated method stub
		List<EMICardGeneration> list=	hrf.findAll();
		return list;
	}
	
}
