package chapter05;

import java.util.Scanner;

public class Method2 {
	
	void orderf() {

		
		
		Method br = new Method();
		
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				
				System.out.print("주문한 빵의 갯수 : ");
				int c1 = sc.nextInt();
				if(c1 > 0) {
					for(int i=1; i<=c1; i++) {
						System.out.println(i + "번째 빵을 만들었습니다");
					}
					System.out.println("요청하신 " + c1 + "개의 빵이 모두 완료되었습니다");
				} else {
					System.out.println("빵갯수다시입력");
				}
				
			} else if(num == 2) {
				
				System.out.print("주문한 빵의 갯수 : ");
				int c2 = sc.nextInt();
				
				if(c2 > 0) {
					System.out.print("주문한 빵의 종류 : ");
					String cc2 = sc.next();
						for(int i=1; i<=c2; i++) {
							System.out.println(i + "번째 " + cc2 + " 빵을 만들었습니다");
						}
						System.out.println("요청하신 " + c2 + "개의 " + cc2 + "이 모두 완료되었습니다");
				} else {
					System.out.println("빵갯수다시입력");
				}
				
			} else if(num == 3) {
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}

}
