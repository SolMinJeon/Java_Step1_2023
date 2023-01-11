package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		// 구구단
		/*
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println("----------");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int a = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(a + "*" + i + " = " + (a*i));
		}

	}

}
