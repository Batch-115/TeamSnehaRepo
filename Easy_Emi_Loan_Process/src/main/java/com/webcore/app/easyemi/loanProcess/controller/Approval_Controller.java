package com.webcore.app.easyemi.loanProcess.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;
import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.service.AppLet_Service;
	
	
	@CrossOrigin("*")
	@RestController
	public class Approval_Controller {
		@Autowired
		AppLet_Service hs;
		
		@RequestMapping(value="/postData",method=RequestMethod.POST)
		public ApprovalLetter registerdata(@RequestBody ApprovalLetter al)
		{		
			System.out.println("ApprovalLetter data save");
			hs.saveData(al);
			return al;
		}
		
				
		@RequestMapping(value = "/getData/{approvalLetterId}",method = RequestMethod.GET)
		public ApprovalLetter getAppData(@PathVariable("approvalLetterId")int appLetterId)
		{
			
			return hs.getAPProvalData(appLetterId);
			
		
					
		}
		
		@RequestMapping(value="/delete/{approvalLetterId}",method=RequestMethod.DELETE)
		public Iterable delete(@PathVariable("approvalLetterId")int approvalLetterId) 
		{
			hs.delete(approvalLetterId);
			System.out.println("ApprovalLetter data delete");
			Iterable l=hs.displayAll();
			return l;
			
		}
		
		
		@RequestMapping(value="/update/{approvalLetterId}",method=RequestMethod.PUT)
		public ApprovalLetter update(@PathVariable("approvalLetterId") int approvalLetterId ,@RequestBody ApprovalLetter al)
		{
			ApprovalLetter ap =hs.updatedata(approvalLetterId,al);
			System.out.println("ApprovalLetter data update");
			return ap;
			
			
		}
}
