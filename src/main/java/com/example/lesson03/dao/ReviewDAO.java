package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	// 1. SELECT(조회)
	public Review selectReview(@Param("id") int id);
	// @Param("id") : parameter 1개일 경우 제거 ㄱㄴ
	
	// 2. INSERT(입력)
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			@Param("storeId") int storeId
			,@Param("menu") String menu
			,@Param("userName") String userName
			,@Param("point") Double point
			,@Param("review") String review
			);
}
