package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfigure {

	@Autowired
	private ProductServiceClient client;
	
	@GetMapping("/fecthProducts")
	private ResponseEntity<?> fetchProducts()
	{
		return ResponseEntity.ok(client.getAllProducts());
	}
	
	@GetMapping("/fetchProducts/{id}")
	private ResponseEntity<?> fetchProduct(@PathVariable int id)
	{
		return ResponseEntity.ok(client.getProduct(id));
	}
}
