package com.springboot.instagram.web.dto.file;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileReqDto {
	private List<MultipartFile> file;
}
