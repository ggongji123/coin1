package basic;

import java.util.Scanner;

public class Exam_03 {

	public Exam_03(Scanner sc) { //4에서 sc받아오기
		System.out.print("num2 : ");
		int num = Integer.parseInt(sc.nextLine());
		Exam_02 ex = new Exam_02(num);
	}
	
	
	
}
