package chapter06;

import java.util.Scanner;

public class gugudanmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gugudan gg = new gugudan();
		
		System.out.print("출력할 단을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		gg.showtable(num);

	}

}
