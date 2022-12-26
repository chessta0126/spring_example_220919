package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO; 
	
	// 1. SELECT(조회)
	public Review getReview(int id) {
		// BO 입장에서 null 가능하면 Integer, 아니면 int 
		return reviewDAO.selectReview(id);
	}
	
	// 2. INSERT(입력)
	// input : Review 객체
	// output : int(insert가 성공된 행 수)
	public int addReview(Review review) {
		// return 타입 void로 하면 리턴값 없으므로
		// DAO한테 받았어도 Controller에게 안 넘길 수 있다.
		return reviewDAO.insertReview(review);
	}
	
	// addReviewAsField(4,"콤비네이션R", "chessta", 4.5, "JMT")
	public int addReviewAsField(
			int storeId
			,String menu
			,String userName
			,Double point
			,String review
			) {
		return reviewDAO.insertReviewAsField(storeId, menu, userName, point, review);
	}
}