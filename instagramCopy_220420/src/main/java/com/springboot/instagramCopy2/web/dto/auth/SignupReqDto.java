package com.springboot.instagramCopy2.web.dto.auth;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.springboot.instagramCopy2.domain.user.User;

import lombok.Data;

@Data
public class SignupReqDto {

	@NotBlank
	private String email;
	@NotBlank
	private String name;
	@NotBlank
	@Size(min=4, max=20) // 4 ~ 20 자를 입력해야함
	private String username;
	@NotBlank
	private String password;
	
	public User toEntity() {
		return User.builder()
				.email(email)
				.name(name)
				.username(username)
				.password(password)
				.build();
	}
}
