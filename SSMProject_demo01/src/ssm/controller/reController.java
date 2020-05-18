package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/redirct")
public class reController {
	@RequestMapping("/first")
	public String refirst(){
		return "firstPage";
	}
	
	@RequestMapping("/add")
	public String readd(){
		return "addPage";		
	}
	
	@RequestMapping("/delete")
	public String redelete(){
		return "deletePage";
	}
	
	@RequestMapping("/update")
	public String reupdate(){
		return "updatePage";
	}
	
	@RequestMapping("/before")
	public String rebefore(){
		return "beforeUpdate";
	}
	
	@RequestMapping("/select")
	public String reselect(){
		return "selectPage";
	}
}
