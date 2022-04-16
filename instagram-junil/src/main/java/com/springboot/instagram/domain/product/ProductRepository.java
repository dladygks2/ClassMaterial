package com.springboot.instagram.domain.product;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductRepository { 
	public int insertProduct(Product product);
}
