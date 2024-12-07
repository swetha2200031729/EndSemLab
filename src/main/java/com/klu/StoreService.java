package com.klu;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StoreService {
	
	List<Product> getProducts() throws Exception;
	
}
