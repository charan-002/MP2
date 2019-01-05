package com.capgemini.salesmanagement.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.dao.IProductDAO;
import com.capgemini.salesmanagement.dao.ProductDAO;
import com.capgemini.salesmanagement.exception.ProductException;

import oracle.net.aso.q;

public class ProductService implements IProductService{

	IProductDAO productDAO=null;
	@Override
	public ProductBean getProductDetails(int productCode) throws Exception {
		ProductBean productBean = null;
		productDAO = new ProductDAO();
		return productBean = IProductDAO.getProductDetails(productCode);
	}

	@Override
	public boolean insertSalesDetails(ProductBean productBean) throws ClassNotFoundException, IOException, SQLException {
		boolean productSeq;
		productSeq=ProductDAO.insertSalesDetails(productBean);
		return false;
	}

	public void validateProductSales(ProductBean productBean) throws ProductException {
 
		List<String> list=new ArrayList<>();
		if(!(isValidId(productBean.getSalesId())))
		{
			list.add("enter valid id and must be numeric" );
		}
		if(!(isValidCode(productBean.getProductCode())))
		{
			list.add(" code must be numeric");
		}
		if(!(isValidQuantity(productBean.getQuantity())))
		{
			list.add("quantity must be numeric");
		}
		if(!(isValidPrice(productBean.getProductPrice())))
		{
			list.add("price must greater than 0");
		}
		if(!list.isEmpty())
		{
			throw new ProductException(list + " ");
		}
	}

	private boolean isValidPrice(double productPrice) {
		return productPrice>0;
	}

	private boolean isValidQuantity(int quantity) {
		return quantity>0;
	}

	private boolean isValidCode(int productCode) {
		return productCode>0;
	}

	private boolean isValidId(int salesId) {
		return salesId>0;
	}

}
