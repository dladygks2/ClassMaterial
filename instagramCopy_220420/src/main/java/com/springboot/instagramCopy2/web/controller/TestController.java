package com.springboot.instagramCopy2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.instagramCopy2.web.dto.TestDto;

@Controller
public class TestController {
	
	

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testPage() {
		System.out.println("GET 요청");
		return "test";
	}
	
	
	@RequestMapping(value = "/test-submit", method = RequestMethod.POST)
	public String testSubmit(TestDto testDto) {
		System.out.println(testDto);
		System.out.println("POST 요청");
		return "test";
	}
	
	@GetMapping("/test-get")
	public String testGet() {
		System.out.println("GET 요청(testGet)");
		return "test";
	}
	
	@PostMapping("/test-post")
	public String testPost() {
		System.out.println("Post 요청(testPost)");
		return "test";
	}
	
	@PutMapping("/test-put")
	public String testPut() {
		System.out.println("Put 요청(testPut)");
		return "test";
	}
	
	
	@DeleteMapping("/test-dele")
	public String testDel() {
		System.out.println("DEL 요청(testDel)");
		return "test";
	}
}
