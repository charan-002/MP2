package com.capgemini.salesmanagement.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;
import com.capgemini.salesmanagement.service.IProductService;
import com.capgemini.salesmanagement.service.ProductService;

public class Client {
    static IProductService iproductService=null;
    static ProductService productService=null;
    static ProductBean productBean=null;
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		
		System.out.println("------------------------");
		System.out.println("1.Generate Bill");
		System.out.println("2.Add Sales");
		System.out.println("3.Exit");
		System.out.println("enter your option");
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter Product Details");
			System.out.println();
			System.out.println("Enter the product code");
			int productCode=scanner.nextInt();
			System.out.println("Enter the quantity");
			int quantity=scanner.nextInt();
			break;
		case 2:
			
			while(productBean==null)
			{
				productBean=populateproductBean();
			}
			productService=new ProductService();
			productService.insertSalesDetails(productBean);
		
			break;
			
		case 3:
				System.exit(0);
		default :
			scanner.close();
			System.out.println("enter valid option");
				System.exit(0);
		}
		
			
	}
	
	private static ProductBean populateproductBean() {
	  productBean=new ProductBean();
		System.out.println("enter sales ID");
		productBean.setSalesId(scanner.nextInt());
		System.out.println("enter product code");
		productBean.setProductCode(scanner.nextInt());
		System.out.println("enter quantity");
		productBean.setQuantity(scanner.nextInt());
		System.out.println("enter product price: ");
		productBean.setProductPrice(scanner.nextDouble());
		try
		{
			productService.validateProductSales(productBean);
			return productBean;
		}
		catch(Exception productException ) {
			System.err.println("Invalid data");
			System.err.println(productException.getMessage()+"\n Try again");
			System.exit(0);
		}
		return productBean;
		
	}
}
