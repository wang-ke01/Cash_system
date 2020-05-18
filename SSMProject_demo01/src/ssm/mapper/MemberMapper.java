package ssm.mapper;

import java.util.ArrayList;
import java.util.List;

import ssm.bean.Member;

public interface MemberMapper {
	
	//根据姓名或手机号查询成员
	ArrayList<Member> getMemberByNameOrPhoto(String nameorphoto);
	
	//添加成员
	boolean addMember(Member member);
	
	//根据姓名或手机号删除成员
	boolean deleteMember(String name);
	
	//根据id查询成员
	Member getMemberById(String id);
	
	//修改成员信息
	Integer updateMember(Member member);
	
	//查询所有成员
	List<Member> getAllMembers();
	
	
}
