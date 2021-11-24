package com.camunda.demo.FYP_BPMN_Mini_projet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Send_kickoff_email implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Sending an email to invite students to the FYP kick-off presentation...");

//		execution.getProcessEngineServices().getRuntimeService()
//		.createMessageCorrelation("Hello, you are invited to the FYP kick-off presentation")
//		.correlate();

	}

}
