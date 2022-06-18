package com.springboot.instagramCopy2.web.dto.auth;

import lombok.Data;

@Data
public class SignupRespDto<T> {
	private int code;
	private T msg;
	private T data;
}
