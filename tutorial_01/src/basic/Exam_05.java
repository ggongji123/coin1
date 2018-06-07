package basic;

import java.util.ArrayList;

class A{
	public String toString() {
		return "AA";
	}
}
class B{
	public String toString() {
		return "BB";
	}
}
class C{
	public String toString() {
		return "CC";
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		A ap = new A();
		B bp = new B();
		C cp = new C();
		
//		Object obj1 = new A();
//		Object obj2 = new B();
//		Object obj3 = new C(); //다형성적인 표현 - 부모객체에 자식을 담는다.
		
		Object [] obj = new Object[3];
		obj[0] = new A();
		obj[1] = new B();
		obj[2] = new C();
		
		for(int i = 0 ; i< obj.length ; i++) {
			System.out.println(obj[i]);
		}
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new A());
		

	}

}
