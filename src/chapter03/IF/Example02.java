package chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender가 F면 남성입니다 그렇지 않으면 여성입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(F/M) : ");
		String gen = sc.next();
//		char gen = sc.next().charAt(0);
//		if(gen == 'F')
		
		if(gen.equals("F")) {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다");
		}
		
		System.out.println("--------------------");
		
		System.out.println("주문하시겠습니까? (Y,N) : ");
		
		char ch = sc.next().charAt(0);
		
		if (ch == 'Y' || ch == 'y') {
			System.out.print("메뉴를 입력하세요 : ");
			String me = sc.nextLine();
			System.out.print(me + "(가)이 주문 완료되었습니다");
		} else {
			System.out.println("취쇼");
		}

	}

}
