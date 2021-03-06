package com.springboot.instagramCopy2.domain.user;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

	private int id;
	private String email;
	private String name;
	private String username;
	private String password;
	
	private LocalDateTime create_date;
	private LocalDateTime update_date;
}
