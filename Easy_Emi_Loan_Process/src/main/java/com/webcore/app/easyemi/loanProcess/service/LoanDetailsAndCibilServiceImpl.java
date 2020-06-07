package com.webcore.app.easyemi.loanProcess.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.CustomerCibil;
import com.webcore.app.easyemi.loanProcess.model.CustomerLoanDetails;
import com.webcore.app.easyemi.loanProcess.repository.CibilRepository;
import com.webcore.app.easyemi.loanProcess.repository.LoanDetailsRepository;

@Service
public class LoanDetailsAndCibilServiceImpl implements LoanDetailsAndCibilService{
	@Autowired
	CibilRepository cibilrepository;
	@Autowired
	LoanDetailsRepository loandetailsrepository;
	
	private float interest;
	private float repayment;
	private float installment;

	@Override
	public void saveCibilData(CustomerCibil customercibil) {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       Date dateobj = new Date();
	       
	       if(customercibil.getCibilScore()<=299) {
				customercibil.setStatus("rejected");
				customercibil.setCibilRemark(" veypoor cibil");
				customercibil.setCibilScoreDateTime(df.format(dateobj));
				cibilrepository.save(customercibil);
	       }
		if(customercibil.getCibilScore()>=300&&customercibil.getCibilScore()<=579) {
			customercibil.setStatus("rejected");
			customercibil.setCibilRemark("poor cibil");
			customercibil.setCibilScoreDateTime(df.format(dateobj));
			System.out.println(customercibil.getCibilId());
			System.out.println(customercibil.getCibilScore());
			System.out.println(customercibil.getCibilRemark());
			System.out.println(customercibil.getCibilScoreDateTime());
			cibilrepository.save(customercibil);
			
		}
		if(customercibil.getCibilScore()>=580&&customercibil.getCibilScore()<=669) {
			customercibil.setStatus("approved");
			customercibil.setCibilRemark("fair cibil");
			customercibil.setCibilScoreDateTime(df.format(dateobj));
			cibilrepository.save(customercibil);
		}
		if(customercibil.getCibilScore()>=670&&customercibil.getCibilScore()<=739) {
			customercibil.setStatus("approved");
			customercibil.setCibilRemark("good cibil");
			customercibil.setCibilScoreDateTime(df.format(dateobj));
			cibilrepository.save(customercibil);
		}
		if(customercibil.getCibilScore()>=740&&customercibil.getCibilScore()<=850) {
			customercibil.setStatus("approved");
			customercibil.setCibilRemark("very good cibil");
			customercibil.setCibilScoreDateTime(df.format(dateobj));
			cibilrepository.save(customercibil);
		}
		
	}

	@Override
	public CustomerCibil getCustomerCibilData(int cibilId) {
		return cibilrepository.findById(cibilId).get();
	}

	@Override
	public void saveLoanDetails(CustomerLoanDetails customerloandetails) {
		interest=(customerloandetails.getLoanCalculation().getLoanAmount()*customerloandetails.getLoanCalculation().getRateOfInterest()
				*customerloandetails.getLoanCalculation().getTenure())/1200;
		customerloandetails.getLoanCalculation().setTotalInterest(interest);
		repayment=customerloandetails.getLoanCalculation().getLoanAmount()+interest;
		customerloandetails.getLoanCalculation().setTotalRepayment(repayment);
		installment=repayment/customerloandetails.getLoanCalculation().getTenure();
		customerloandetails.getLoanCalculation().setLoanInstallment(installment);
		loandetailsrepository.save(customerloandetails);
		
	}

	@Override
	public CustomerLoanDetails getLoanDetails(int loanDetailId) {
		return loandetailsrepository.findById(loanDetailId).get();
		
	}

	@Override
	public void updateLoanDetails(CustomerLoanDetails customerloandetails) {
		loandetailsrepository.save(customerloandetails);
		
	}

	@Override
	public void deleteLoanDetails(int loanDetailId) {
		loandetailsrepository.deleteById(loanDetailId);
		
	}

	@Override
	public void updateCibilData(CustomerCibil customercibil) {
		cibilrepository.save(customercibil);
		
	}

	@Override
	public void deleteCibilData(int cibilId) {
		cibilrepository.deleteById(cibilId);
		
	}

}
