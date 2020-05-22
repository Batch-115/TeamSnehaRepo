package com.webcore.app.easyemi.loanProcess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.service.Home_Service;

@RestController
public class Home_Controller {
	
	@Autowired
	Home_Service hs;

}
