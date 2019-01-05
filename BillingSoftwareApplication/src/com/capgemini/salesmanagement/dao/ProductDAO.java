package com.capgemini.salesmanagement.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.util.DBConnection;

public class ProductDAO implements IProductDAO{
	public ProductBean getProductDetails(int productCode) throws  IOException, SQLException, ClassNotFoundException {
		
		Connection connection=DBConnection.getConnection();
		PreparedStatement prepareStatement=null;
		
		return null;
	}
	public boolean insertSalesDetails(ProductBean productBean) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = DBConnection.getConnection();
		PreparedStatement prepareStatement = null;
		//PreparedStatement prepareStatement1 = null;
		ResultSet resultSet = null;
		prepareStatement=connection.prepareStatement(QueryMapper.INSERT_SALES);
		prepareStatement.setInt(1,productBean.getSalesId());
		prepareStatement.setInt(2,productBean.getProductCode());
		prepareStatement.setInt(3,productBean.getQuantity());
		prepareStatement.setDouble(4,productBean.getLineTotal());
		prepareStatement.executeUpdate();
		return false;
	}

}
