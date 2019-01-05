package com.capgemini.salesmanagement.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.capgemini.salesmanagement.bean.ProductBean;

public interface IProductDAO {

	static ProductBean getProductDetails(int productCode) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	boolean insertSalesDetails(ProductBean productBean) throws ClassNotFoundException, IOException, SQLException;
}
