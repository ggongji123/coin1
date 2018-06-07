package mms.member.action;
// 인터페이스 : 다중상속을 목적으로 구현하는 유일한 자바의 클래스
// 다형성적인 표현을 효과적으로 구현하기 위해 사용된다.
// 
import java.util.Scanner;

public interface Action {
	
	public abstract void execute(Scanner sc); //abstract안써도 인페니까 자동으로 되어있음.

}
