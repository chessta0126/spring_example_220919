package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.model.UsedGoods;

@RestController // @Controller + @ResponseBody
public class Lesson02Ex01RestController {

	@Autowired
	private UsedGoodsBO usedGoodsBO; // spring bean을 주입받음(Dependency Injection)
	
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01(){
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList() ;
		return usedGoodsList; // json으로 출력(@ResponseBody 있으므로)
	}
}