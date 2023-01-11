package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		//스캐너클래스 인스턴스 변수 scan에 값을 입력
		//A, a = 우수고객 / B,b = 일반회원 / 나버지 = 고객
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요(A, B, C) : ");
		char grade;
		grade = sc.nextLine().charAt(0);
		
		String a;
		
		switch (grade) {
		case 'A': case 'a':
			a = "우수고객";
			break;
			
		case 'B': case 'b':
			a = "일반회원";
			break;
			
		default:
			a = "고객";
			break;
		}

		System.out.println(a);
		
	}

}
