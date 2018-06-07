package basic;

import java.util.ArrayList;
import java.util.Scanner;

class Member{
	// 멤버필드
	private String name;
	private String address;
	private String email;
	private String phone;
	private int age;
		
	// 생성자메서드
	public Member(String name, String address, String email, String phone, int age) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.age = age;
		
	}
	
	// 멤버메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name = " + name + ", address = " + address
				+ ", email = " + email + " , phone = " + phone + " , age = " + age + "\n";
	}
	
	public void show() {
		System.out.print("name = " + name);
		System.out.print(" , address = " + address);
		System.out.print(" , email = " + email);
		System.out.print(" , phone = " + phone);
		System.out.println(" , age = " + age);
	}
	
	// 중첩클래스
}

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
//		Member[] mList = new Member[10]; // 10명 회원 등록
		ArrayList<Member> mList = new ArrayList<Member>(); // <member> 안씀 왜? 각종데이터 다담을수 있음
		// <member>쓰면 일반화.. 이 객체만쓰것다.
		boolean check = true;
		
		while(true) {
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
			
			/*메뉴에 입력된 값에 따라 수행하는 기능을 기술*/
			if(menu == 1) {
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
				
			mList.add(new Member(name, address, email, phone, age));
				
				
				
			}// 등록처리
			else if(menu == 2) {
				System.out.println("전체회원목록 출력");
				for(int i = 0; i < mList.size(); i++) {
//				mList.get(i).show();
				System.out.println(mList.get(i)); // toString 사용. 메소드 안갖구와두돼
					
				}
				
				
			}// 목록보기
			else if(menu == 3) {
				check = true;
				System.out.println("수정할 회원의 이름을 입력하세요");
				System.out.print("이름 = ");
				String name = sc.nextLine();
				/* 회원의 수만큼 입력받은 이름과 일치하는 이름이 있는지 비교작업을 수행한다. */
				for(int i =0; i< mList.size(); i++) {
					if(name.equals(mList.get(i).getName())) {
						System.out.println(name+ "회원의 수정할 정보를 입력하세요");
						System.out.print("이전주소 :" + mList.get(i).getAddress());
						System.out.print(" => 변경주소 =");
						String address = sc.nextLine();
						mList.get(i).setAddress(address);
						
						System.out.print("이전메일 :" + mList.get(i).getEmail());
						System.out.print(" => 변경메일 =");
						String email = sc.nextLine();
						mList.get(i).setEmail(email);
						
						System.out.print("이전전화 :" + mList.get(i).getPhone());
						System.out.print(" => 변경전화 =");
						String phone = sc.nextLine();
						mList.get(i).setPhone(phone);
						
						System.out.print("이전나이 :" + mList.get(i).getAge());
						System.out.print(" => 변경나이 =");
						int age = Integer.parseInt(sc.nextLine());
						mList.get(i).setAge(age);
						
						System.out.println(mList.get(i).getName()+ "회원 정보수정 성공");
						check = false;
						break;
						//브레이크걸면 for밖으로 나가져서 바로실행.
						//그래서 체크 걸어놓기.
					}
				}
				
				// 반복문 안의 if의 else와 의미가 같다.
				if(check) {
				System.out.println(name + "과 일치하는 회원의 정보가 존재하지 않습니다.");
				}
				
			}// 정보수정
			else if(menu == 4) {
				check = true;
				System.out.print("삭제할 회원의 이름을 입력하세요");
				String name = sc.nextLine();
				for(int i = 0 ; i < mList.size(); i++) {
					if(name.equals(mList.get(i).getName())) {
						mList.remove(i);
						System.out.println(name + "의 회원정보 삭제 성공!");
						// 저절로 줄어드나? 순서를 앞으로 안빼줘도되나요 
						check = false;
						break;
					}
				}
				if(check) {
				System.out.println(name + "의 회원정보가 존재하지 않습니다.");
				}
			}// 정보삭제
			else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}// 종료
			else {
				System.out.println("메뉴 선택이 올바르지 않습니다.");
			}// 메뉴에 존재하지 않는 값을 입력
			
		}

	}

}
