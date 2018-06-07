package mms.member.store;

import java.util.ArrayList;

import mms.member.action.ModifyMemberAction;
import mms.member.vo.MemberDTO;

public class DataStore {

	public static ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

	// ArrayList에 객체를 저장하는 작업을 수행하는 메서드
	public boolean insert(MemberDTO dto) {
		boolean check = true;
		try {
			list.add(dto); // 여기서문제가 없다면 바로 실행, 문제발생하면 Exception 실행
		} catch (Exception e) {
			check = false;

		}
		return check;
	}

	// ArrayList에 저장된 객체를 리턴하는 역할을 수행하는 메서드
	public ArrayList<MemberDTO> selectAll() {
		return list;
	}

	// 저장공간에 저장된 하나의 객체를 리턴시켜주는 메서드
	public MemberDTO select(String name) {
		MemberDTO dto = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				dto = list.get(i); // 이름일치하면 i번째 자료 리턴
			}
		}
		return dto; // null or 이름들어간것 두개가 조건에 따라 넘어감.
	}

	// 저장공간에 저장된 하나의 객체를 제거하는 작업을 수행하는 메서드 - 이름
	public void delete(MemberDTO dto) {
		for(int i = 0; i <list.size(); i++) {
			if(list.get(i).getName().equals(dto.getName())) {
				list.remove(i);
			}
		}
		
	}
	// 변경된 객체를 가지고와서 저장공간의 객체와 변경하는 작업을 수행하는 메서드
	public void modify(MemberDTO updateMember,MemberDTO oldMember) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(oldMember.getName())) {
				list.set(i, updateMember);
			}

		}
	}

}
