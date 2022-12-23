package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO; 
	
	public Review getReview(int id) {
		// BO 입장에서 null 가능하면 Integer, 아니면 int 
		return reviewDAO.selectReview(id);
	}
}
