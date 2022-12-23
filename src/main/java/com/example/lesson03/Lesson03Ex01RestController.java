package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class Lesson03Ex01RestController {

	@Autowired
	private ReviewBO reviewBO;

	// http://localhost:8080/lesson03/ex01?id=아이디
	@RequestMapping("/lesson03/ex01")	
	public Review ex01(
// 필수 파라미터 : id가 안 들어오면 error(null 불가 -> int)
//		@RequestParam("id") int id) {
//		@RequestParam(value="id") int id) {
//		@RequestParam(value="id", required=true) int id) {

// 비필수 파라미터
//		@RequestParam(value="id", required=false) Integer id) { 
		@RequestParam(value="id", defaultValue="1") int id) { // 비필수 파라미터 (파라미터 없으면 default)
//		if(id == null) {
//			return null;
//		} else {
			return reviewBO.getReview(id);
//		}
	}
}
