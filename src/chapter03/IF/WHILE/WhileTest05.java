package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, cnt=0, sum=0;
		double avg;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
			cnt+=1;
		}
		
		avg = (double)sum / cnt;
		System.out.println("갯수 : " + cnt);
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
