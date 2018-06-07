package mms.member.action;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.store.DataStore;
import mms.member.view.ConsoleUtils;
import mms.member.vo.MemberDTO;

public class ViewMemberAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 저장공간에 저장된 모든 회원의 정보를 출력하는 작업을 수행한다.
		//step1. 저장공간에 저장된 모든 회원의 정보를 가져온다.
		DataStore ds = new DataStore();
		ArrayList<MemberDTO> list = ds.selectAll(); //타입을 배열로 selectall!(다 꺼내기)
		//step2. 가져온 회원정보를 화면에 출력하는 작업을 수행한다.
		ConsoleUtils cu = new ConsoleUtils();
		cu.showAllMember(list); //콘솔에서  쇼올멤버갖고오기
		
		if(list == null) {
			cu.showFail();
		}
	}

}
