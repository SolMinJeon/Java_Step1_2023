package chapter05;

import java.util.Scanner;

public class Method {
	
	//필드 =  맴버변수
	
	//생성자(디폴트 생략)
	
	//메소드
	
	void makeBread() {
		System.out.println("빵을 만듭니다");	
	}
	
	void makeBread(int count, String str) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		
		for(int i=1; i<=count; i++) {
			System.out.println(i + "번째 " + str + "을 만들었습니다");
		}
		System.out.println("요청하신 " + count + "개의 " + str + "이 모두 완료되었습니다");
		
	}
	
	void order() {
		
		Scanner sc = new Scanner(System.in);
		boolean rn = true;
		
		while(rn) {
			
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("주문한 빵의 갯수 : ");
				int c1 = sc.nextInt();
				if(c1 > 0) {
					for(int i=1; i<=c1; i++) {
						System.out.println(i + "번째 빵을 만들었습니다");
					}
					System.out.println("요청하신 " + c1 + "개의 빵이 모두 완료되었습니다");
				} else {
					System.out.println("빵갯수다시");
				}
				break;
				
			case 2:
				System.out.print("주문한 빵의 갯수 : ");
				int c2 = sc.nextInt();
				//input값이 int인지
				
				if(c2 > 0) {
					System.out.print("주문한 빵의 종류 : ");
					String cc2 = sc.next();
					//input 값이 str인지
					//if(cc2 == String) {
						for(int i=1; i<=c2; i++) {
							System.out.println(i + "번째 " + cc2 + " 빵을 만들었습니다");
						}
						System.out.println("요청하신 " + c2 + "개의 " + cc2 + "이 모두 완료되었습니다");
					//}
				} else {
					System.out.println("갯수다시");
				}
				break;
				
			case 3:
				System.out.println("프로그램 종료");
				rn = false;
				
				break;

			default:
				break;
			}
			
		}
		
	}

}
