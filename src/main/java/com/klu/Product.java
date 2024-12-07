package com.klu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	private long id;
	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	private Rating rating;
}
