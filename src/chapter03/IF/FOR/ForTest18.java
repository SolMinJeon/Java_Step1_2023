package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된수만큼 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i, j, k;
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
