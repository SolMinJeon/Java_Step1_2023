package chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		// 
		
		boolean run = true;
		int num=0, ye=0, ch=0, za=0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("예금액> ");
				ye += sc.nextInt();
				if(ye <= 0) {
					System.out.println("금액을 다시 입력해 주세요");
				} else {
				za = ye;
				}
				break;
				
			case 2:
				System.out.print("출금액> ");
				ch = sc.nextInt();
				if(ch > za) {
					System.out.println("잔액이 무족합니다");
				} else {
				za = ye - ch;
				}
				break;
				
			case 3:
				System.out.println("잔고> " + za);
				break;
				
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				break;
			}
			
			System.out.println();
			
		}

	}

}
