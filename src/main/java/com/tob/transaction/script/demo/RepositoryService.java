package com.tob.transaction.script.demo;

import java.util.Date;
import java.util.List;

public interface RepositoryService {

	public List<Double> findPaymentDueBeforeDate(Object contractId, Date date);
	
	public Contract findPhoneContract(Object contractNumber);
	
	public void insertRecognition(Object contractNumber, double amount, Date date);
}
