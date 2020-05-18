package ssm.mapper;

import java.util.ArrayList;
import java.util.List;

import ssm.bean.Member;

public interface MemberMapper {
	
	//�����������ֻ��Ų�ѯ��Ա
	ArrayList<Member> getMemberByNameOrPhoto(String nameorphoto);
	
	//��ӳ�Ա
	boolean addMember(Member member);
	
	//�����������ֻ���ɾ����Ա
	boolean deleteMember(String name);
	
	//����id��ѯ��Ա
	Member getMemberById(String id);
	
	//�޸ĳ�Ա��Ϣ
	Integer updateMember(Member member);
	
	//��ѯ���г�Ա
	List<Member> getAllMembers();
	
	
}
