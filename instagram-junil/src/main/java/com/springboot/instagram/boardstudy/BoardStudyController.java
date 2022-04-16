package com.springboot.instagram.boardstudy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.instagram.boardstudy.db.BRepository;
import com.springboot.instagram.boardstudy.db.BoardStudy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller //IoC
@RequestMapping("/study")
public class BoardStudyController {
	
	private final BRepository bRepository;
	
	@Value("${test.filename}")
	private String filename;
	
	@Value("${file.path}")
	private String filePath;
	
	@GetMapping("/file")
	public String file() {
		
		System.out.println(filePath);
		
		File file = new File(filePath + filename);
		/*
		 * if(!file.exists()) { file.mkdirs(); }
		 */
		
		return null;
	}
	
	@GetMapping("/board")
	public String boardPage(Model model, @RequestParam int page) {
		List<BoardStudy> boardListAll = bRepository.getBoardList();
		if(page == 0) {
			model.addAttribute("b", boardListAll);
			
		}else {
			int boardListAllSize = boardListAll.size();
			int startIndex = (page - 1) * 5;
			int endIndex = page * 5;
			
			List<BoardStudy> boardList = new ArrayList<BoardStudy>();
			for(int i = startIndex; i < endIndex && i < boardListAllSize; i++) {
				boardList.add(boardListAll.get(i));
			}
			
			model.addAttribute("b", boardList);
		}
		return "study/board";
	}
	
}
