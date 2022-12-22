package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // 공용으로 쓸 수 있는 주소
@Controller
public class Lesson01Ex01Controller {

	// String 출력하기
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody
	@RequestMapping("/1")
	public String printString() {
		String text = "예제 1번<br> 문자열을 response body로 보내는 예제";
		return text;
	}
	
	// Map 출력하기
	// http://localhost:8080/lesson01/ex01/2
	
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> printMap(){ // @ResponseBody 여기다 써도 되는데, 이렇게 잘 쓰진 않음
		// java의 Map : {"aaaa"=1111,"bbbb"=1111....}
		Map <String,Object> map = new HashMap<>();
		map.put("aaaa", 1111);
		map.put("bbbb", 1111);
		map.put("cccc", 2222);
		map.put("dddd", 3333);
		
		// Spring web starter 때문에 jackson이라는 라이브러리가 포함되어 있음
		return map; // map을 return하면 json으로 return한다. {"aaaa":1111,"bbbb":1111....}
	}
}
