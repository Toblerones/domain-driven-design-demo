package com.tob.domain.model.web.demo;

import java.util.Date;

import com.tob.domain.model.demo.Contract;

public class RecognitionService extends ApplicationServiceDemo {
	public void calculateRevenueRecognitions(Object contractNumber){
		
		Contract contract = Contract.readById(contractNumber);
		contract.calculateRecognitions();
	}
	
	public double recognizedRevenue(Object contractNumber, Date asOf){
		return Contract.readById(contractNumber).recognizedRevenue(asOf);
	}
}
