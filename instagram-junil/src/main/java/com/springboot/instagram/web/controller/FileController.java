package com.springboot.instagram.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.instagram.web.dto.file.FileReqDto;

@Controller
public class FileController {
	
	@GetMapping("/filetest")
	public String fileForm() {
		
		return "file/file";
	}
	
	@PostMapping("/file-insert")
	@ResponseBody
	public String fileInsert(FileReqDto fileReqDto) {
		for(MultipartFile file : fileReqDto.getFile()) {
			System.out.println(file.getOriginalFilename());
		}
		return "test";
	}
}
