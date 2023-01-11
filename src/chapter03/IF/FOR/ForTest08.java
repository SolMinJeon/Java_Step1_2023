package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		Scanner sc = new Scanner(System.in);
		
		int a=0, cnt3=0, cnt5=0;
		System.out.print("정수를 입력하세요 : ");
		
		
		for(int i=0; i<10; i++) {
			a = sc.nextInt();
			
			if(a == 0) {
				continue;
			} else {
				if(a % 3 == 0) {
					cnt3 += 1;
				}
				if(a % 5 == 0) {
					cnt5 += 1;
				}
			}
			
		}
		
		
		System.out.println("3의 배수 : " + cnt3 + "개");
		System.out.println("5의 배수 : " + cnt5 + "개");
	}

}
