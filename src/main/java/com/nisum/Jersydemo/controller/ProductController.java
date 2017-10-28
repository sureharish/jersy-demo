package com.nisum.Jersydemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	@RequestMapping(value="/getAllProduct",method=RequestMethod.GET)
	public ResponseEntity<?> getAllProducts()
	{
		return new ResponseEntity<>("hai", HttpStatus.OK);
	}

}
