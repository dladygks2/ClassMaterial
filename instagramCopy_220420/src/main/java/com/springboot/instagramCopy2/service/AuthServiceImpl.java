package com.springboot.instagramCopy2.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.springboot.instagramCopy2.domain.user.UserRepository;
import com.springboot.instagramCopy2.web.dto.auth.SignupReqDto;
import com.springboot.instagramCopy2.web.dto.auth.SignupRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService{
	

	private final UserRepository userRepository;
	
	@Override
	public SignupRespDto<?> validCheck(SignupReqDto signupReqDto, BindingResult bindingResult) {
		// AuthController 안의 signup메서드의 if문 코드를 넣어준다.
		if(bindingResult.hasErrors()) {
			System.out.println("밸리데이션 체크 오류");
			Map<String, String> errorMap = new HashMap<String, String>();
			for(FieldError error : bindingResult.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
				// field는 변수명, defaultMessage는 어떤 에러인지 자동으로 생성해준다.
			}
			SignupRespDto<Map<String, String>> signupRespDto = new SignupRespDto<Map<String,String>>();
			signupRespDto.setCode(400);
			signupRespDto.setData(errorMap);
			
			return signupRespDto;
		}else {
			System.out.println("밸리데이션 체크 성공");
			// 중복확인 
			int checkUsernameResult = userRepository.usernameCheckByUsername(signupReqDto.getUsername());
			SignupRespDto<String> signupRespDto = new SignupRespDto<String>();
			
			
			if(checkUsernameResult == 0) {
				// 검색된 것이 없으니 username이 중복되지 않는다는 의미
				signupRespDto.setCode(200);
				signupRespDto.setData("회원가입 성공");
			}else{
				// 회원가입 불가능(username 중복)
				signupRespDto.setCode(401);
				signupRespDto.setData("이미 존재하는 아이디입니다.");
			}
			return signupRespDto;
		}
		
	}

}
