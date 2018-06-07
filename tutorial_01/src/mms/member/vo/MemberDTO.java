package mms.member.vo;

//Model(모델) : 단순히 데이터를 담아서 전달할 목적으로 구현되는 클래스
// 한명의 회원에 대한 정보를 관리할 목적으로 구현되는 클래스

public class MemberDTO {

	// 멤버필드 : default 초기화
	private String name;
	private String address;
	private String email;
	private String phone;
	private int age;

	// 생성자메서드
	public MemberDTO() {
		// 멤버필드를 초기화시켜주는 역할을 수행한다.
		// 프로그램이 동작할 때 처음에 수행할 작업을 기술한다.
	}
	
	// 메서드 - 오버로딩(OverLoading)
	public MemberDTO(String name, String address, String email, String phone, int age) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.age = age;
	
	}
	 

	// 멤버메서드 : set~ get~
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
	
	// 사용자의 필요엥 의해 별도의 메서드를 추가할 수 있다.
	// 출력목적으로 toString을 자주 씀.
	@Override // 재정의 - 자식객체의 메서드명이 부모객체의 메서드명과 동일한 경우
	// 조건 1. 접근지정자와 예외문구에 주의
	// 접근지정자의 순위 : private < protected < public
	// 예외문구 - throws~
	public String toString() {
		return "name = " + name + ", address = " + address + ", email = " + email + " , phone = " + phone + " , age = "
				+ age + "\n";
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
