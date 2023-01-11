package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		// 정수를 입ㄺ받아 입력받은 정수부터 100까지의 합을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		int tot = 0;
		
		for(int a = sc.nextInt(); a<=100; a++) {
			tot += a;
		}
		System.out.println("합 : " + tot);
			
		//1에서부터 10까지 반속의 정수를 입력받아 그수 중에 짝수 갯수 출력 0이면 무시
		
		int jjak = 0;
		for(int i=0; i<10; i++) {
			int b = sc.nextInt();
			if(b == 0) {
				continue;
			} else if (b % 2 == 0) {
				jjak += 1;
			}
		}
		System.out.println("갯수 : " + jjak);
	}

}
