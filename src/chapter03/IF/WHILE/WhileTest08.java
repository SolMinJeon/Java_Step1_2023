package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택하세요.: ");
			num = sc.nextInt();
			System.out.println();
			switch (num) {
			
			case 1:
				System.out.println("입력하기를 선택하셨습니다");
				break;
				
			case 2:
				System.out.println("출력하기를 선택하셨습니다");
				break;
				
			case 3:
				System.out.println("삭제하기를 선택하셨습니다");
				break;
				
			case 4:
				System.out.println("끝내기를 선택하셨습니다");
				break;

			default:
				System.out.println("잘 못 입력하셨습니다");
				break;
			}
			
			if(num == 4) {
				break;
			}
			System.out.println();
		}
		
		System.out.println("프로그램종료");

	}

}
