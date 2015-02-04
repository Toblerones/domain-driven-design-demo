package com.tob.domain.model.demo;

import java.util.Date;

public class RevenueRecognition {
	private double amount;
	private Date date;
	public RevenueRecognition(double amount, Date date) {
		super();
		this.amount = amount;
		this.date = date;
	}
	
	public double getAmount(){
		return amount;
	}
	
	boolean isRecognizableBy(Date asOf){
		return asOf.after(date) || asOf.equals(date);
	}
}
