package com.nisum.Jersydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.Jersydemo.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value="/getAllProduct",method=RequestMethod.GET)
	public ResponseEntity<?> getAllProducts()
	{
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
	 
	
	@RequestMapping(value="/getProduct",method=RequestMethod.GET)
	public ResponseEntity<?> getProduct()
	{
		return new ResponseEntity<>(productService.updateProduct(), HttpStatus.OK);
	}
	@RequestMapping(value="/updateProduct",method=RequestMethod.PUT)
	public ResponseEntity<?> updateProduct()
	{
		return new ResponseEntity<>(productService.updateProduct(), HttpStatus.OK);
		
		
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.PUT)
	public ResponseEntity<?> save()
	{
		return new ResponseEntity<>(productService.updateProduct(), HttpStatus.OK);
		
		
	}
}
