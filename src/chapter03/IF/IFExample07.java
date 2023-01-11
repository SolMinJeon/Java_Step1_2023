package chapter03.IF;

import java.util.Scanner;

public class IFExample07 {

	public static void main(String[] args) {
		
		// 입력 Scanner 클래스 초기화 -> 인스턴스 변수방 선언
		Scanner sc= new Scanner(System.in);
		System.out.print("1. 첫번째 수 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.println("첫번째 입력받은 수 출력 : " + num1);
		System.out.println();
		
		System.out.print("2. 두번째 수 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("두번째 입력받은 수 출력 : " + num2);
		System.out.println();
		
		double n = num1 / num2;
		
		if(num2 != 0.0) {
			System.out.println("나눈값" + n);
		} else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		
//		int i = sc.nextInt();
//		String a = sc.next();
//		char b = sc.next().charAt(0);
//		
//		System.out.println(i);
//		System.out.println(a);
//		System.out.println(b);

	}

}
