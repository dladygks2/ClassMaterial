package com.springboot.instagram.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.domain.product.ProductRepository;
import com.springboot.instagram.web.dto.product.ProductReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProductController {
	
	private final ProductRepository productRepository;
	
	@PostMapping("/insert-product")
	public String productInsert(ProductReqDto productReqDto) {
		System.out.println(productReqDto);
		productRepository.insertProduct(productReqDto.toEntity());
		return "";
	}
}
