package chapter03.IF;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		//소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 프로그램명언어활용(pro), 정보시스템 구축(os)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int soft1 = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		int soft2 = sc.nextInt();
		
		System.out.print("데이터베이스 구축 : ");
		int db = sc.nextInt();
		
		System.out.print("소프트웨어 설계 : ");
		int pro = sc.nextInt();
		
		System.out.print("프로그램밍언어활용 : ");
		int os = sc.nextInt();
		
		int tot = soft1 + soft2 + db + pro + os;
		
		//int avg = tot / 5;
		
		if (tot > 60 && soft1 > 8 && soft2 >= 8 && db > 8 && pro > 8 && os > 8) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		/*if (tot<60 || soft1<8 || soft2<8 || db<8 || pro<8 || os<8) {
			System.out.println("불");
		} else {
			System.out.println("합");
		}*/
		
		/*int[] arr = new int[5];
		String[] cl = {"소프트웨어 설계 : ", "소프트웨어 개발 : ", "데이터베이스 구축 : ", "프로그래밍언어활용 : ", "정보시스템 구축 : "};
		int tot = 0;
		int cnt = 0;
		
		//while(true) {
		
		for (int i = 0; i < 5; i++) {
			System.out.print(cl[i]);
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			tot = tot + arr[i];
			if (arr[i] <= 8) cnt = cnt + 1;
		}
		
		if (tot > 60 && cnt == 0) {
			System.out.println("합");
		} else {
			System.out.println("불");
		}
		
		//}*/

	}

}
