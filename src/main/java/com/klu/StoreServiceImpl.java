package com.klu;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<Product> getProducts() throws RestClientException {
		return Arrays.asList(restTemplate.getForObject(
				"https://fakestoreapi.com/products",
				Product[].class)
		);
	}

}
