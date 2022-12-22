package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsDAO;
import com.example.lesson02.model.UsedGoods;

// Business Object(B.O.), service
@Service
public class UsedGoodsBO {
	
	@Autowired // spring bean을 주입받음(Dependency Injection)
	private UsedGoodsDAO usedGoodsDAO;
	
	// input : Controller가 아무것도 안 줌
	// output : List<UsedGoods>
	public List<UsedGoods> getUsedGoodsList(){
		return usedGoodsDAO.selectUsedGoodsList();
	}
}
