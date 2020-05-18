package ssm.controller;


import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.bean.User;
import ssm.utils.Utils;

@Controller
@RequestMapping(value="/login")
public class login {
	
	@RequestMapping(value="/first")
	public String reLogin(){
		return "login";	
	}
	
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request,Map<String,Object> map,HttpSession session){
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User user = new User();
		if(name.equals("ssm")&&password.equals("123")){
			user.setId(Utils.getUUID());
			user.setUsername(name);
			user.setPassword(password);
			session.setAttribute("User",user);
			return "redirect:tofirst";
		}
		map.put("b",false);
		return "login";		
	}
	@RequestMapping("/tofirst")
	public String toFirst(){
		return "firstPage";
	}
	
}
