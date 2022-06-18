package com.springboot.instagramCopy2.service;

import org.springframework.validation.BindingResult;

import com.springboot.instagramCopy2.web.dto.auth.SignupReqDto;
import com.springboot.instagramCopy2.web.dto.auth.SignupRespDto;

public interface AuthService {

	public SignupRespDto<?> validCheck(SignupReqDto signupReqDto, BindingResult bindingResult);


}
