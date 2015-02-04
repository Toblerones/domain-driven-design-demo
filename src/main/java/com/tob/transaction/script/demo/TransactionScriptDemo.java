package com.tob.transaction.script.demo;

import java.util.Date;

public class TransactionScriptDemo {
	
	private static RecognitionService recognitionService = new RecognitionService();;
	
	public static void main(String[] args){
		
		// Case 1:
		// If you are customer and going to check 
		// how many need to pay before today for his mobile plan
		// From the telecom website
		
		//Customer input his contract number. 
		Object contractNumber = new Object(); //..
		recognitionService.recognizedRevenue(contractNumber, new Date());
		
		
		// Case 2:
		// A staff helped customer to issue a new contract for mobile plan today.
		// during EOB, staff try to submit this contract's revenue to company.
		recognitionService.calculateRevenueRecognitions(contractNumber);
	}
}
