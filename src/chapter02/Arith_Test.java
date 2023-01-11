package chapter02;

import java.util.Scanner;

public class Arith_Test {

	public static void main(String[] args) {
		// 총좀과 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		int mathScrore;
		int engScore;
		
		mathScrore = sc.nextInt();
		engScore = sc.nextInt();
		
//		int mathScrore = 96;
//		int engScore = 87;
		
		//총점
		double tot = mathScrore + engScore;
		System.out.println("Total : " + tot);
		
		//평균 + - * /
		double avg = tot / 2;
		System.out.println("Average : " + avg);
		
		System.out.println("Total : " + (mathScrore + engScore));
		System.out.println("Average : " + (double)(mathScrore + engScore) / 2);
		
	}

}
