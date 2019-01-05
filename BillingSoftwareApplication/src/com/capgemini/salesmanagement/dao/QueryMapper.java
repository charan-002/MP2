package com.capgemini.salesmanagement.dao;

public class QueryMapper {

	public static final String INSERT_SALES="insert into sales values(?,?,?,SYSDATE,?)";
	public static final String GET_PRODUCT_DETAILS="select *from product where product_code=?";
}
