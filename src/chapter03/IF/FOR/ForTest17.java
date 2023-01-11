package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ 만큼출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		sc.close();
 
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		

	}

}
