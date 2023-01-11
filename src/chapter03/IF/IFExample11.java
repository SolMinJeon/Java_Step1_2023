package chapter03.IF;

import java.util.Scanner;

public class IFExample11 {

	public static void main(String[] args) {
		
		//server
		String sid = "wasd";
		int spw = 1234;
		
		//Scanner 인스턴스 변수 선언
		Scanner sc = new Scanner(System.in);
		
		//변수로 값받기
		System.out.print("ID : ");
		String id = sc.next();
		System.out.println();
		System.out.print("PassWord : ");
		String ppw = sc.next();
		System.out.println();
		sc.close();
		
		//형변환
		int pw = Integer.parseInt(ppw);
		
		//중첩질의
//		if (id.equals(sid)) {
//			if (pw == spw) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("비밀번호가 틀립니다");
//			}
//		} else if(pw == spw){
//			System.out.println("아이디가 틀립니다");
//		} else {
//			System.out.println("아이디와 비밀번호가 틀립니다");
//		}
		
		if (id.equals(sid) && pw == spw) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		

	}

}
