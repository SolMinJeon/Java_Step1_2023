package chapter03.IF.WHILE;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		
		int i=1;
		
		while(i<=10) {
			System.out.println(i);
			i+=1;
		}
		System.out.println("프로그램 종료");
		*/
		int num = 1, sum = 0;
		
		while(num<=10) {
			sum+=num;
			num+=1;
		}
		System.out.println("현재의 num값 : " + num);
		System.out.println("1 ~ 10까지의 합 : " + sum);
	}

}
