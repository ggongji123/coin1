package mms.member.action;

import java.util.Scanner;

import mms.member.store.DataStore;
import mms.member.view.ConsoleUtils;
import mms.member.vo.MemberDTO;

public class RemoveMemberAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 1. 삭제할 회원의 이름을 받아온다.
		ConsoleUtils cu = new ConsoleUtils();
		String name = cu.getName("삭제", sc);
		// 2. 입력받은 이름을 가지고 저장공간에 해당이름의 정보 보여주기
		DataStore ds = new DataStore();
		MemberDTO dto = ds.select(name); //이전객체출력
		if(dto == null) {
			cu.nameFail(name);
			return; //이름이 없을때 fail
		}
		
		//3. 지우기
		ds.delete(dto);

	}

}
