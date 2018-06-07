package mms.member.ui;

import java.util.Scanner;

import mms.member.action.Action;
import mms.member.action.AddMemberAction;
import mms.member.controller.FrontController;
import mms.member.action.ModifyMemberAction;
import mms.member.action.RemoveMemberAction;
import mms.member.action.ViewMemberAction;

public class MainProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean isStop = false;
		
		/* 프로그램 전체 흐름을 관리하는 클래스의 객체 생성 */
		FrontController fc = new FrontController();
		//fc는 전달만 하는 역할.
		
		do{
			System.out.println(); // 개행
			/* 메뉴 출력 */
			System.out.println("== 회원관리프로그램 ==");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램종료");
			System.out.println("======================");
			System.out.print("메뉴 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			/* Action ㅋ르래스를 관리하고 제어할 목적의 인터페이스 객체 선언 */
			Action ac = null; //객체 기본값 담으려면 null
			
			switch(menu){
				case 1: // 회원등록
					ac = new AddMemberAction(); //ac 다형성적인 표현
					break;
				case 2: // 목록보기
					ac = new ViewMemberAction();
					break;
				case 3: // 정보수정
					ac = new ModifyMemberAction();
					break;
				case 4: // 정보삭제
					ac = new RemoveMemberAction();
					break;
				case 5: // 작업종료
					System.out.println("프로그램을 종료합니다.");
					isStop = true;
					break;
				default : 
					System.out.println("메뉴선택이 올바르지 않습니다.");
					
					
			}
			
			if(ac != null) {//액션에 값이 들어왔다면, 사용자가 요청했다면
				fc.processRequest(ac, sc); //액션과 스캐너 받은 값 리퀘스트에 전달하것다.
			}
		}while(!isStop); 
			
		

	}

}
