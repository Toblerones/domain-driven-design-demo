package com.tob.domain.model.web.demo;

import java.util.Date;

public class ApplicationServiceDemo {
	
	// DI
	RecognitionService recognitionService;
			
	// Simulate the web access
	public Object doPost(){
		
		Object contractNumber = null;
		Date date = null;
		
		// assume upper layer ask for service
		
		recognitionService.calculateRevenueRecognitions(contractNumber);
		
		recognitionService.recognizedRevenue(contractNumber, date);
	
		return null;
	}
}
