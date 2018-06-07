package mms.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.vo.MemberDTO;

public class ConsoleUtils {
	
	// 회원정보를 입력받아 객체화해서 되돌려주는 작업을 수행하는 메서드.
	public MemberDTO getNewMember(Scanner sc) {
		
		System.out.println("등록할 회원의 정보를 입력해주세요.");
		System.out.print("이름 = ");
		String name = sc.nextLine();
		System.out.print("주소 = ");
		String address = sc.nextLine();
		System.out.print("이메일 = ");
		String email = sc.nextLine();
		System.out.print("연락처 = ");
		String phone = sc.nextLine();
		System.out.print("나이 = ");
		int age = Integer.parseInt(sc.nextLine());

		return new MemberDTO(name, address, email, phone, age);
		// memberDTO 리턴. - 결과값이 dTO이다.// 호출한곳으로 - add멤버액션으로 감.

	}
	
	public void addSuccess() {
		System.out.println("회원등록이 성공!!");
	}
	public void addFail() {
		System.out.println("회원등록 실패!!"); //출력이라 콘솔이갖고잇음.
	}
	
	//목록보기 메뉴를 통해 회원정보를 보여줌.
	public void showAllMember(ArrayList<MemberDTO> list) {
		System.out.println("회원목록보기");
		for(int i=0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void showSuccess() {
		System.out.println("회원목록보기 성공!!");
	}
	
	public void showFail() {
		System.out.println("회원목록보기 실패!!");
	}
	
	// 이름을 입력받아 리턴시켜주는 메서드 - 수정 or 삭제
	public String getName(String kind, Scanner sc) {
		System.out.println(kind + "할 이름을 입력해주세요");
		System.out.print("이름= ");
		return sc.nextLine(); // 입력받은 값을 리턴.
	}
	
	public void nameFail(String name) {
		System.out.println(name + "회원에 정보가 존재하지 않습니다.");
		//name ? 수정할때도 name으로 입력.. 생각하고 변수지정해라.
		
	}
	
	// 기존에 회원정보를 보여주고 수정할 내용을 입력받아 객체화한 후 리턴시켜주는 메서드
	public MemberDTO getUpdateMember(MemberDTO oldMember, Scanner sc) {
		System.out.println(oldMember.getName() + "회원의 수정할 정보를 입력해주세요.");
		System.out.print("이전주소 : " + oldMember.getAddress());
		System.out.print(" => 변경주소 = ");
		String address = sc.nextLine();
		System.out.print("이전 이메일 : " + oldMember.getEmail());
		System.out.print(" => 변경이메일 =");
		String email = sc.nextLine();
		System.out.print("이전연락처 : " + oldMember.getPhone());
		System.out.print(" => 변경연락처 = ");
		String phone = sc.nextLine();
		System.out.print("이전나이 : " + oldMember.getAge());
		System.out.print(" => 변경나이 = ");
		int age = Integer.parseInt(sc.nextLine());
		
		return new MemberDTO(oldMember.getName(), address, email, phone, age);
		
	}
	
	
}
