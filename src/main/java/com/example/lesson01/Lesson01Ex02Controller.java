package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	  // @RestController 쓰면 안 됨(Responsebody 있으면 data로 인식하므로)
public class Lesson01Ex02Controller {

	// http://localhost/lesson01/ex02/1
	@RequestMapping("/lesson01/ex02/1")
	public String ex02() {
		// @ResposeBody가 없는 상태로 String을 리턴하면
		// ViewResolver에 의해, 리턴된 String 이름의 view 경로를 찾고 화면이 구성된다.
		
		// prefix=/WEB-INF/jsp/
		// suffix=.jsp
		// return "/WEB-INF/jsp/lesson01/ex02.jsp";
		return "lesson01/ex02"; // prefix, suffix 제외한 response의 view 경로
	}
}
