package chapter03.IF.Example;

import java.util.Scanner;

public class Example_For01 {

	public static void main(String[] args) {
		// 1 ~ 100 까지의 수중 3의 배수의 합
		
		//Scanner sc = new Scanner(System.in);
		
		int t = 0;
		for(int i=0; i<100; i++) {
			if(i % 3 == 0) {
				t = t + i;
			}
		}
		System.out.println("3의 배수의 합 : " + t);

	}

}
