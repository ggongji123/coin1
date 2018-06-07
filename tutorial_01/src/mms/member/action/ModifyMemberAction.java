package mms.member.action;

import java.util.Scanner;

import mms.member.store.DataStore;
import mms.member.view.ConsoleUtils;
import mms.member.vo.MemberDTO;

public class ModifyMemberAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 회원정보를 수정하는 작업을 수행한다.
		// Step1. 수정할 회원의 이름을 받아온다.
		ConsoleUtils cu = new ConsoleUtils();
		String name = cu.getName("수정", sc);
		// Step2. 입력받은 이름을 가지고 저장공간에 해당 이름의 객체를 가져온다.
		DataStore ds = new DataStore();
		MemberDTO oldMember = ds.select(name); //이전객체출력
		if(oldMember == null) {
			cu.nameFail(name);
			return; //이름이 없을때 fail
		}
		// Step3. 가져온 객체를 화면에 출력한 후 수정할 내용을 입력받아 객체화시킨다.
		MemberDTO updateMember = cu.getUpdateMember(oldMember, sc);
		// Step4. 수정된 내용을 가지고 있는 객체를 다시 저장공간으로 보내 내용을 업데이트 한다.
		ds.modify(updateMember, oldMember);

	}

}
