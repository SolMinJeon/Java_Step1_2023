package chapter05;

import java.util.Scanner;

public class FunTest07 {
	
	
	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	
//	public static String Edustep(int edu) {
//		String step = "";
//		if(edu == 1) {
//			step = "1단계";
//		} else if(edu == 2) {
//			step = "2단계";
//		} else if(edu == 3) {
//			step = "3단계";
//		} else {
//			step = "해당하는 스터디단계가 없습니다";
//		}
//		return step;
//	}
	
	public static void Edustep(int step) {

		if(step == 1) {
			System.out.println("현재 수없 단계는 1");
		} else if(step == 2) {
			System.out.println("현재 수없 단계는 2");
		} else if(step == 3) {
			System.out.println("현재 수없 단계는 3");
		} else {
			System.out.println("해당하는 스터디단계가 없습니다");
		}	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int num = sc.nextInt();
//		String step = Edustep(num);
//		System.out.println("현재 수없 단계는 : " + step + " 입니다");
		
		//return값이 없는경우
		
		Edustep(num);
		
	}

}
