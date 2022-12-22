package com.example.lesson02.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.lesson02.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {
	// interface라 객체생성 못하므로, MyBatis가 객체를 만들어서 넣어준다.

	// input : service(BO)가 아무것도 안 줌
	// output : List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();
}
