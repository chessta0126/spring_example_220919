package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller(스프링 객체) + @ResponseBody(return값을 여기에 넣어 보낸다.)
public class Lesson01Ex01RestController {

	// http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	// @ResponseBody // @RestController에 포함되어 있음
	public String ex01_3() {
		return "@RestController 사용해서 String을 리턴한다.";
	}
	
	// http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	// @ResponseBody
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		map.put("aaa","qqq");
		map.put("bbb","aaa");
		map.put("ccc","www");
		
		return map;
	}

	// http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data(); // java bean(일반 객체)
		data.setId(1);
		data.setName("chessta");
		return data; // 일반 bean 객체로, json으로 변환된다.
	}

	// http://localhost:8080/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data(); // java bean(일반 객체)
		data.setId(1);
		data.setName("chessta");
		
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
}
