package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seler , Double sum) {
		this.sellerName = seler.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	

}
