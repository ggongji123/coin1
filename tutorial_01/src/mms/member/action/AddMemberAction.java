package mms.member.action;

import java.util.Scanner;

import mms.member.store.DataStore;
import mms.member.view.ConsoleUtils;
import mms.member.vo.MemberDTO;

public class AddMemberAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 회원등록을 위한 작업을 수행한다.
		// step1. 회원정보를 입력받는다.
		ConsoleUtils cu = new ConsoleUtils();
		// step2. 입력받은 회원정보를 객체화(MemberDTO)한다. 콘솔이 수행.
		MemberDTO newMember = cu.getNewMember(sc);
		//newMember = new MemberDTO(name, address, email, phoen, age);
		
		// step3. 객체화된 정보를 저장공간(ArrayList)으로 전달한다.
		DataStore ds = new DataStore();
		
		// step4. 저장공간에 작업의 수행여부를 판단하여 메시지를 출력한다.
		boolean isCheck = ds.insert(newMember); //isCheck로 받기
		
		if(isCheck) {
			cu.addSuccess();
		}else {
			cu.addFail();
		}
	}

}
