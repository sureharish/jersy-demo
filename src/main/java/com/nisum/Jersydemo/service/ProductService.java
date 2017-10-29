package com.nisum.Jersydemo.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public String getAllProducts()
	
	{
		return "all the prodcuts";
	}
	
public String getProduct()
	
	{
		return "one prodcut";
	}
public String updateProduct()
{
	return "product update";
}
}
