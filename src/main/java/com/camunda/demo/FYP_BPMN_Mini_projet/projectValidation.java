package com.camunda.demo.FYP_BPMN_Mini_projet;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class projectValidation implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Random rando=new Random();
		execution.setVariable("validation", rando.nextBoolean());
		execution.setVariable("RestValidation","validated");

	}

}
