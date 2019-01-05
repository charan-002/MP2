package com.capgemini.salesmanagement.bean;

import java.util.Date;

public class ProductBean {

	public double productPrice;
	public int salesId;
	public int productCode;
	public int quantity;
	public double lineTotal;
	public Date salesDate;
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public int getSalesId() {
		return salesId;
	}
	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getLineTotal() {
		return lineTotal=productPrice*quantity;
	}
	public void setLineTotal(double lineTotal) {
		this.lineTotal = lineTotal;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
}
