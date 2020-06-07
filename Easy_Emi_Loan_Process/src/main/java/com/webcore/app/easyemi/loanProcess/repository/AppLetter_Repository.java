package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;

@Repository
public interface AppLetter_Repository extends CrudRepository<ApprovalLetter, Integer>
{

	ApprovalLetter findAllByapprovalLetterId(int apId);

}
