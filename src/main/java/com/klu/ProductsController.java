package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

	@Autowired
	private StoreService storeService;
	
	@GetMapping("/products")
	ResponseEntity<List<Product>> getProducts() throws Exception {
		return ResponseEntity.ok(storeService.getProducts());
	}
	
}
