package com.tob.transaction.script.demo;

import java.util.Date;

public class Contract {

	Object PhoneType;
	double revenue;
	Date dateSigned;
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public Date getDateSigned() {
		return dateSigned;
	}
	public void setDateSigned(Date dateSigned) {
		this.dateSigned = dateSigned;
	}
	public Object getPhoneType() {
		return PhoneType;
	}
	public void setPhoneType(Object phoneType) {
		PhoneType = phoneType;
	}
	
	
}
