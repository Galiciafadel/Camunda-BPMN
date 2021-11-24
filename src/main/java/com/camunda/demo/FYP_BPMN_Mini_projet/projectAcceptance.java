package com.camunda.demo.FYP_BPMN_Mini_projet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class projectAcceptance implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Sending an email announcing the students that their project has been ACCEPTED");
	}

}
