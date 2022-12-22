package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Spring bean : Spring container에 쌓이는 객체.
public class TestController {

	// http://localhost:8080/test1
	@ResponseBody // return값을 Response body에 넣어 보낸다.
	@RequestMapping("/test1") // 주소 매핑
	public String test1() {
		return "Hello World!!!";
	}
}
