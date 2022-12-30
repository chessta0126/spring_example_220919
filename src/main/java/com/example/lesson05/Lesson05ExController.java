package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05ExController {

	// http://localhost:8080/lesson05/ex01
	@GetMapping("/ex01")
	public String ex01() {
		return "/lesson05/ex01";
	}

	// http://localhost:8080/lesson05/ex02
	@GetMapping("/ex02")
	public String ex02(Model model) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("mango");
		
		model.addAttribute("fruits",fruits);
		
		// List<Map>
		List<Map<String,Object>> users = new ArrayList<>();
		Map<String,Object> user = new HashMap<>();
		user.put("name", "chessta");
		user.put("age", 25);
		user.put("hobby", "작곡");
		users.add(user);
		
		user = new HashMap<>(); // 오버라이딩
		user.put("name", "CHRIS GUARDY");
		user.put("age", 19);
		user.put("hobby", "치토스 먹방");
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "/lesson05/ex02";
	}

	// http://localhost:8080/lesson05/ex03
	@GetMapping("/ex03")
	public String ex03(Model model) {
		return "/lesson05/ex03";		
	}
}