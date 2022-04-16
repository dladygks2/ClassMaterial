package com.springboot.instagram.boardstudy.db;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 
 * Entity 객체
 *
 */
@Data
public class BoardStudy {
	private int board_id;
	private String board_img;
	private String board_content;
	private int user_id;
	private String username;
	private String profile_img;
	private LocalDateTime update_date;
}
