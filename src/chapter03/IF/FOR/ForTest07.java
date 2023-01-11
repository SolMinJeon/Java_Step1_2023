package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a > 0 && a < 11) {
			for(int i=1; i<=a; i++) {
				System.out.println("Java 프로그래밍!");
			}
		} else {
			System.out.println("입력값이 잘못 되었습니다");
		}
		
		System.out.println("프로그램이 종료됩니다");

	}

}
