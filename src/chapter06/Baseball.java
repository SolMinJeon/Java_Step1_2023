package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		do {
			//1에서 9사이의 난수
			com1 = new Random().nextInt(9)+1;
			com2 = new Random().nextInt(9)+1;
			com3 = new Random().nextInt(9)+1;
			
			int carr[] = {com1, com2, com3};
			
		} while (com1 == com2 || com1 == com3 || com2 == com3);
		//컴퓨터 준비 완료
		//사용자가 입력할 수
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;
		
		while(true) {
			System.out.println("==1 ~ 9 사이의 수를 입력하세요==");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1 = sc.nextInt(); //사용자가 준비한 수
			System.out.print("두번째 수를 입력하세요 : ");
			user2 = sc.nextInt(); //사용자가 준비한 수
			System.out.print("세번째 수를 입력하세요 : ");
			user3 = sc.nextInt(); //사용자가 준비한 수
			
			int uarr[] = {user1, user2, user3};
			
			int strike = 0;
			int ball = 0;
			
			//만약 com1과 사용자가 입력한 첫번째(user1) 숫자가 같은 확률
			/*
			for(int i=1; i<=3; i++) {
				for(int j=1; j<=3; j++) {
					if(uarr[i] == carr[j]) {
						
					}
				}
			}
			*/
			
			if(com1 == user1) {
				strike++;
			}else if(com2 == user1 || com3 == user1) {
				ball++;
			}
			
			if(com2 == user2) {
				strike++;
			}else if(com1 == user2 || com3 == user2) {
				ball++;
			}
			
			if(com3 == user3) {
				strike++;
			}else if(com1 == user3 || com2 == user3) {
				ball++;
			}
			
			//------------------------------
			if(strike == 3) {
				System.out.println("정답!! - " + com1 + com2 + com3);
				break;
			} else {
				if(strike > 0 || ball > 0) {
					System.out.println(strike + "Strike, " + ball + "Ball");
				} else { //아무것도 일치하는 것이 없을 경우
					System.out.println("OUT!!");
					System.out.println("=================");
				}
			}
			
			
			
		}
	}

}
