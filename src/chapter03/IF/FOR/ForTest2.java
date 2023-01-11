package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int sum = 0;
		
		System.out.println("1부터 " + a + "까지의 수 출력");
		
		for(int i=1; i<=a; i++) {
			System.out.print(i + " + " + sum + " = ");
			sum = sum + i;
			System.out.println(sum);
		}
		
		System.out.println("1부터 " + a + "까지의 합 : " + sum + "입니다");

	}

}
