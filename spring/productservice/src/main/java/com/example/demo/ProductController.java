package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private static List<Product > productList = new ArrayList<>();
	static {
		productList.add(new Product(1,"product1",12.0));
		productList.add(new Product(2,"product2",14.0));
		productList.add(new Product(3,"product1",16.0));
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> getProducts()
	{
		return ResponseEntity.ok(productList);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProducts(@PathVariable int id)
	{
		Product product = findProduct(id);
		if(product == null)
		{
			return ResponseEntity.badRequest().body("invalis product id");
		}
		return ResponseEntity.ok(product);
	}

	private Product findProduct(int id) {
		return productList.stream()
				.filter(user -> user.getId()
				.equals(id)).findFirst().orElse(null);
	}
}
