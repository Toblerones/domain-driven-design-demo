package com.tob.domain.model.demo;

public class CompleteRecognitionStrategy extends RecognitionStrategy{

	@Override
	void calculateRevenueRecognitions(Contract contract) {
		contract.addRevenueRecognition(new RevenueRecognition(contract.getRevenue(), contract.getWhenSigned()));
		
	}

}
