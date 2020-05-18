package ssm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import ssm.bean.Member;
import ssm.service.MemberService;
import ssm.utils.Utils;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	/**
	 * 获取所有的成员
	 * */
	@RequestMapping(value="/getAllMembers")
	public String getAllMember(){
		List<Member> allMembers = memberService.getAllMembers();
		System.out.println(allMembers.size());
		return null;		
	}
	/**
	 * 根据name获取成员
	 * */
	@RequestMapping(value="/getMemberByNameOrPhoto")
	public String getMemberByNameOrPhone(String nameorphoto,Map<String, Object> map,HttpServletRequest request){
		ArrayList<Member> members = memberService.getMemberByNameOrPhoto(nameorphoto);
		if (members==null||members.size()==0) {
			map.put("b",false);
			return "selectPage";
		}
		System.out.println("有"+members.size()+"条数据");
		
		String str="<table><tr><td>id</td><td>name</td><td>age</td><td>sex</td><td>phone</td><td>address</td><td>hobby</td><td>date</td><td>remarks</td><td clospan='2'>OPTION</td></tr>";
		//获取项目路径
		String path = request.getContextPath();
		for (int i = 0; i < members.size(); i++) {
			str += "<tr><td>"+members.get(i).getId()+"</td><td>"+members.get(i).getName()+"</td><td>"+members.get(i).getAge()+"</td><td>"+members.get(i).getSex()+"</td><td>"+members.get(i).getPhone()+"</td><td>"+members.get(i).getAddress()+"</td><td>"+members.get(i).getHobby()+"</td><td>"+members.get(i).getDate()+"</td><td>"+members.get(i).getRemarks()+"</td><td><a href='"+path+"/getMemberById?id="+members.get(i).getId()+"'>修改</a></td></tr>";
		}
		str += "</table>";
		map.put("table",str);
		return "member";		
	}
	
	/**
	 * 添加会员成员信息
	 * */
	@RequestMapping(value="/addMember",method=RequestMethod.POST)
	public String addMember(HttpServletRequest request,Member member,Map<String,Object> map){
		String name = request.getParameter("name");
		System.out.println(name);
		member.setId(Utils.getUUID());
		member.setDate(Utils.formatDate());
		boolean b = memberService.addMember(member);
		if(b){
			return "firstPage";
		}
		map.put("b",b);
		return "addMember";
	}
	
	/**
	 * 通过name删除会员
	 * */
	@RequestMapping(value="/deleteMember")
	public String deleteMember(String name,Map<String, Object> map){
		boolean b = memberService.deleteMember(name);
		if(b){
			return "firstPage";
		}
		map.put("b", b);
		return "deletePage";
	}
	
	/**
	 * 修改之前查询
	 */
	@RequestMapping(value="/beforeUpdate",method=RequestMethod.POST)
	public String beforeUpdate(String name,Map<String,Object> map,HttpServletRequest request){
		ArrayList<Member> members = memberService.getMemberByNameOrPhoto(name);
		if(members==null||members.size()==0){
			map.put("b", 0);
			return "beforeUpdate";
		}
		
		String str="<table><tr><td>id</td><td>name</td><td>age</td><td>sex</td><td>phone</td><td>address</td><td>hobby</td><td>date</td><td>remarks</td><td>OPTION</td></tr>";
		//获取项目路径
		String path = request.getContextPath();
		for (int i = 0; i < members.size(); i++) {
			str += "<tr><td>"+members.get(i).getId()+"</td><td>"+members.get(i).getName()+"</td><td>"+members.get(i).getAge()+"</td><td>"+members.get(i).getSex()+"</td><td>"+members.get(i).getPhone()+"</td><td>"+members.get(i).getAddress()+"</td><td>"+members.get(i).getHobby()+"</td><td>"+members.get(i).getDate()+"</td><td>"+members.get(i).getRemarks()+"</td><td><a href='"+path+"/getMemberById?id="+members.get(i).getId()+"'>修改</a></td></tr>";
		}
		str += "</table>";
		map.put("table", str);
		return "member";
	}
	
	
	/**
	 * 修改之前最后一步，通过id查询member，通过上一个方法的member页面的操作传来的id查询member传给updatePage页面再传给下面方法
	 */
	@RequestMapping(value="/getMemberById")
	public String getMemberById(String id,Map<String,Object> map){
		Member member = memberService.getMemberById(id);
		if(member!=null){
			map.put("member",member);
			return "updatePage";
		}	
		map.put("b", 0);
		return "beforeUpdate";		
	}
	
		
	/**
	 * 修改
	 */
	@RequestMapping(value="/updateMember",method=RequestMethod.POST)
	public String updateMember(Member member,Map<String,Object> map){
		Integer row = memberService.updateMember(member);
		if(row>0){
			return "firstPage";
		}
		map.put("b",false);
		return "updatePage";
	}
	
	
}
