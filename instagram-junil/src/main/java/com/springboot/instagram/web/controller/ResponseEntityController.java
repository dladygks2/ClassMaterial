package com.springboot.instagram.web.controller;

import java.nio.charset.Charset;

import javax.sound.midi.MidiEvent;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.domain.user.User;
import com.springboot.instagram.domain.user.UserRepository;
import com.springboot.instagram.web.dto.test.TestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ResponseEntityController {
	
	private final UserRepository userRepository;
	
	@PostMapping("/rsp-entity")
	public ResponseEntity<?> test(@RequestBody TestDto dto){
		User userEntity = userRepository.getUserByUsername(dto.getUsername());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		return new ResponseEntity<User>(userEntity, HttpStatus.OK);
	}
}
