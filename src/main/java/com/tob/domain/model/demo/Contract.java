package com.tob.domain.model.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Product product;
	private double revenue;
	private Date whenSigned;
	//private int id;
	
	//private RepositoryService repository;
	
	public Contract(Product product, double revenue, Date whenSigned) {
		super();
		this.product = product;
		this.revenue = revenue;
		this.whenSigned = whenSigned;
	}
	
	private List<RevenueRecognition> revenueRecognitions = new ArrayList<RevenueRecognition>();
	
	public double recognizedRevenue(Date asOf){
		double totalRevenueAsDate = 0;
		
		for (RevenueRecognition r : revenueRecognitions){
			if(r.isRecognizableBy(asOf)){
				totalRevenueAsDate = totalRevenueAsDate + r.getAmount();
			}
		}
		return totalRevenueAsDate;
	}

	public void addRevenueRecognition(RevenueRecognition revenueRecognition) {
		// TODO Auto-generated method stub		
	}
	
	public static Contract readById(Object contractNumber){
		return null;	
	}

	public void calculateRecognitions(){
		product.calculateRevenueRecognitions(this);
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public Date getWhenSigned() {
		return whenSigned;
	}

	public void setWhenSigned(Date whenSigned) {
		this.whenSigned = whenSigned;
	}

	public List<RevenueRecognition> getRevenueRecognitions() {
		return revenueRecognitions;
	}

	public void setRevenueRecognitions(List<RevenueRecognition> revenueRecognitions) {
		this.revenueRecognitions = revenueRecognitions;
	}
	
	
}
