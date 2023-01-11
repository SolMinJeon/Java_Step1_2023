package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// 몇명의 성적을 ㅇㅂ력 받을 것ㅇㄴ지 정수로 인원ㅅ를 입력받는다 총점과 평군을 ㅜ하시오 평균 실수
		
		Scanner sc = new Scanner(System.in);
		int sum=0, cnt=0;
		double avg = 0;
		
		System.out.print("몇명의 학생 점수를 입력 받으시겠습니까? : ");
		int std = sc.nextInt();
		
		for(int i=1; i<=std; i++) {
			//System.out.print(i + "번째 학생의 점수를 입력 : ");
			sum += sc.nextInt();
			cnt+=1;
			
		}
		
		avg = (double)sum / cnt;
		
		System.out.println("학생수 : " + std);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
