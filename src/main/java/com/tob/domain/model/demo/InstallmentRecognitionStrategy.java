package com.tob.domain.model.demo;

import java.util.Date;

public class InstallmentRecognitionStrategy extends RecognitionStrategy{

	private int firstRecognitionOffset;
	private int secondRecognitionOffset;
	
	public InstallmentRecognitionStrategy(int firstRecognitionOffset,
			int secondRecognitionOffset) {
		super();
		this.firstRecognitionOffset = firstRecognitionOffset;
		this.secondRecognitionOffset = secondRecognitionOffset;
	}

	@Override
	void calculateRevenueRecognitions(Contract contract) {
		double totalRevenue = contract.getRevenue();
		double[] allocation = new double[3];
		allocation[0] = totalRevenue/3;
		allocation[1] = totalRevenue/3;
		allocation[2] = totalRevenue - allocation[0] - allocation[1];
		
		contract.addRevenueRecognition(new RevenueRecognition(allocation[0], contract.getWhenSigned()));
		contract.addRevenueRecognition(new RevenueRecognition(allocation[0], addDays(contract.getWhenSigned(),
				firstRecognitionOffset)));
		contract.addRevenueRecognition(new RevenueRecognition(allocation[0], addDays(contract.getWhenSigned(),
				secondRecognitionOffset)));
		
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
