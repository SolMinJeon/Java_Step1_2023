package chapter03.IF;

import java.util.Scanner;

public class IFExample12 {

	public static void main(String[] args) {
		
		String ID = "soldesk";
		int PW = 221227;
		
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		
		if (id.equals(ID)) {
			int pw = sc.nextInt();
			if(pw == PW) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 틀림");
			}
		} else {
			System.out.println("아이디 틀림");
		}
		
	}

}
