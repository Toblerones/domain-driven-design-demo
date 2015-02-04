package com.tob.transaction.script.demo;

import java.util.Date;
import java.util.List;

/**
 * Two Function relates contract's recognition
 * present in class
 * @author Toblerones
 *
 */
public class RecognitionService {
	// Repository service represent database or etc...
	private RepositoryService repository;
	
	/**
	 * Calculate the total revenue before the provide date
	 * Service for customer enquire.
	 * @param contractNumber Customer's phone plan contract number
	 * @param date The date of contract to be pay by customer.
	 * @return
	 */
	public double recognizedRevenue(Object contractNumber, Date date){	
		double totalRevenue = 0;
		
		List<Double> totalPayments = repository.findPaymentDueBeforeDate(contractNumber, date);
		for(Double revenue : totalPayments){
			totalRevenue = totalRevenue + revenue;
		}
		return totalRevenue;
	}
	
	/**
	 * Function provides staff to record a new phone plan as contract
	 * With payment data and due amount.
	 * @param contractNumber new contract number.
	 */
	public void calculateRevenueRecognitions(Object contractNumber){
		
		Contract phoneContract = repository.findPhoneContract(contractNumber);
		
		double totalRevenue = phoneContract.getRevenue();
		Date recognitionDate = phoneContract.getDateSigned();
		String phoneType = (String)phoneContract.getPhoneType();
		
		if(phoneType.equals("Apple")){
			double[] allocation = new double[3];
			allocation[0] = totalRevenue/3;
			allocation[1] = totalRevenue/3;
			allocation[2] = totalRevenue - allocation[0] - allocation[1];
			
			repository.insertRecognition(contractNumber, allocation[0], recognitionDate);
			repository.insertRecognition(contractNumber, allocation[1], addDays(recognitionDate,180));
			repository.insertRecognition(contractNumber, allocation[2], addDays(recognitionDate,360));
			
		}else if(phoneType.equals("Samsung")){
			double[] allocation = new double[3];
			allocation[0] = totalRevenue/3;
			allocation[1] = totalRevenue/3;
			allocation[2] = totalRevenue - allocation[0] - allocation[1];
			
			repository.insertRecognition(contractNumber, allocation[0], recognitionDate);
			repository.insertRecognition(contractNumber, allocation[1], addDays(recognitionDate,60));
			repository.insertRecognition(contractNumber, allocation[2], addDays(recognitionDate,180));
			
		}else if(phoneType.equals("XiaoMi")){
			repository.insertRecognition(contractNumber, totalRevenue, recognitionDate);
		}
		
		
		
	}
	
	/**
	 * Dummy function - provide service to add up date.
	 * @param recognitionDate
	 * @param i
	 * @return
	 */
	private Date addDays(Date recognitionDate, int i) {
		// TODO Add 60 after the input date.
		return null;
	}
	
}
