package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String check;
		
		Start st = new Start();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int a = sc.nextInt();
			check = st.check(a);
			if(check.equals("SUCCESS")) {
				break;
			}
		}
		
	}

}
