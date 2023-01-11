package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		System.out.print("행을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("열을 입력하세요 : ");
		int b = sc.nextInt();
		
		for(i=1; i<=a; i++) {
			for(j=1; j<=b; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}

	}

}
