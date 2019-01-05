package com.capgemini.salesmanagement.service;

import java.io.IOException;
import java.sql.SQLException;

import com.capgemini.salesmanagement.bean.ProductBean;

public interface IProductService {

	ProductBean getProductDetails(int productCode) throws ClassNotFoundException, IOException, SQLException, Exception;
	boolean insertSalesDetails(ProductBean productBean) throws ClassNotFoundException, IOException, SQLException;
}
