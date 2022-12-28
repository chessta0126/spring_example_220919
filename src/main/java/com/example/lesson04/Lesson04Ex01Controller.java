package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.model.User;

@RequestMapping("/lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	// BO를 여러 개 받고 싶으면 개당 하나씩 @Autowired 붙여야 한다.

	// 회원가입 화면
	// http://localhost:8080/lesson04/ex01/add_user_view
	@RequestMapping(path="/add_user_view", method=RequestMethod.GET)
	public String addUserView() {
		// application.properties에서 설정한 앞뒤 경로 제외하고 쓰기
		// 앞 : prefix=/WEB-INF/jsp/
		// 뒤 : suffix=.jsp
		return "lesson04/addUser";
	}
	
	@PostMapping("/add_user")
	public String addUser(
			@RequestParam("name") String name
			,@RequestParam("yyyymmdd") String yyyymmdd
			,@RequestParam(value="email", required=false) String email
			,@RequestParam(value="introduce", required=false) String introduce
			) {
		
		// DB insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		return "lesson04/afterAddUser"; // 결과 jsp
	}
	
	// http://localhost:8080/lesson04/ex01/get_last_user_view
	@GetMapping("/get_last_user_view")
	public String getLastUserView(Model model) {
		// DB select - 가장 마지막에 추가된 사람 1명 가져오기
		User user = userBO.getLastUser();
		
		// model에 데이터를 담아놓으면, jsp에서 꺼내서 쓸 수 있다.
		model.addAttribute("seller",user);
		model.addAttribute("title", "회원 정보");

		return "/lesson04/getLastUser";
		
	}
	
}
