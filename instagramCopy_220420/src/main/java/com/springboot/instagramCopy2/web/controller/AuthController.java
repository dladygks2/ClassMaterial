package com.springboot.instagramCopy2.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagramCopy2.service.AuthService;
import com.springboot.instagramCopy2.web.dto.auth.SignupReqDto;
import com.springboot.instagramCopy2.web.dto.auth.SignupRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AuthController {
	
	private final AuthService authService;

	@PostMapping("/auth/signup")
	public Object signup(@Valid SignupReqDto signupReqDto, BindingResult bindingResult) {
		System.out.println("jsp파일에서 입력받은 것을 js에서 처리한 결과가 signupReqDto에 담긴다고???");
		System.out.println(signupReqDto);
		
		
		return authService.validCheck(signupReqDto, bindingResult);
	}
}
