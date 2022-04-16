package com.springboot.instagram.web.dto.product;

import java.util.List;

import com.springboot.instagram.domain.product.Product;

import lombok.Data;

@Data
public class ProductReqDto {
	private String product_name;
	private List<String> product_category;
	
	public Product toEntity() {
		return Product.builder()
				.product_name(product_name)
				.category_name(product_category)
				.build();
	}
}
