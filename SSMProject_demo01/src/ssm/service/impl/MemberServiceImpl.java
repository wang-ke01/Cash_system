package ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.bean.Member;
import ssm.mapper.MemberMapper;
import ssm.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper mapper;

	@Override
	public ArrayList<Member> getMemberByNameOrPhoto(String nameorphoto) {
		// TODO Auto-generated method stub
		return mapper.getMemberByNameOrPhoto(nameorphoto);
	}

	@Override
	public boolean addMember(Member member) {
		// TODO Auto-generated method stub
		return mapper.addMember(member);
	}

	@Override
	public boolean deleteMember(String name) {
		// TODO Auto-generated method stub
		return mapper.deleteMember(name);
	}

	@Override
	public Member getMemberById(String id) {
		// TODO Auto-generated method stub
		return mapper.getMemberById(id);
	}

	@Override
	public Integer updateMember(Member member) {
		// TODO Auto-generated method stub
		return mapper.updateMember(member);
	}

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return mapper.getAllMembers();
	}

	


}
