package jp.co.sample.emp_management.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//@RestController
//@RequestMapping(value = "/check_password_api")
//public class CheckPasswordApiController {
//	@RequestMapping(value = "/passwordcheck", method = RequestMethod.POST)
//	
//	
//	public Map<String, String> passwordcheck(String password, String confirmationPassword) {
//		Map<String, String> map = new HashMap<>();
//
//		String errorMessage = null;
//		
//		if (password.equals(confirmationPassword)) {
//			errorMessage = "確認用パスワード入力OK!";
//		} else {
//			errorMessage = "パスワードが一致していません";
//		}
//		map.put("errorMessage", errorMessage);
//				
//		return map;
//	}
//
//}
