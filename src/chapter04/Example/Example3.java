package chapter04.Example;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null; //int arr[] = {};
		int max=0;
		int tot = 0;
		double avg = 0;
		boolean w = true;
		Scanner sc = new Scanner(System.in);
		
		while(w) {
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		
		System.out.print("선택> ");
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.print("학생수> ");
			int stu = sc.nextInt();
			arr = new int[stu];
			break;
			
		case 2:
			for(int i=0; i<arr.length; i++) {
				System.out.print("score["+(i+1)+"] : ");
				int sco = sc.nextInt();
				if(sco >= 0) {
					arr[i] = sco;
				} else {
					System.out.println("점수는 0보다 작을 수 없음");
					break;
				}
			}
			break;
			
		case 3:
			for(int i=0; i<arr.length; i++) {
				System.out.println("score["+(i+1)+"] : " + arr[i]);
			}
			System.out.println("----------------");
			break;
			
		case 4:
			for(int i=0; i<arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
				tot += arr[i];
			}
			
			System.out.println("최고점수 : " + max);
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + (double)tot / arr.length);
			
			break;

		default:
			System.out.println("프로그램 종료");
			w = false;
			break;
		}
		}

	}

}
