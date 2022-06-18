package com.springboot.instagramCopy2.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

	public int usernameCheckByUsername(String username);
	
}
