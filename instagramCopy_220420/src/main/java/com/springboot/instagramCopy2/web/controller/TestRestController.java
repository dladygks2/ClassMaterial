package com.springboot.instagramCopy2.web.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagramCopy2.web.dto.TestDto;

@RestController
public class TestRestController {
	
	
	@GetMapping("/test-get2")
	public String testGet() {
		System.out.println("GET 요청(testGet)");
		return "get 요청";
	}
	
	@PostMapping("/test-post2")
	public String testPost() {
		System.out.println("Post 요청(testPost)");
		return "post 요청";
	}
	
	@PutMapping("/test-put2")
	public String testPut() {
		System.out.println("Put 요청(testPut)");
		return "put 요청";
	}
	
	
	@DeleteMapping("/test-dele2")
	public String testDel() {
		System.out.println("DEL 요청(testDel)");
		return "delete 요청";
	}
}
