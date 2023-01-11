package chapter03.IF.FOR;

public class ForTest04 {

	public static void main(String[] args) {
		// 0 ~ 100 까지의 수중 홀수만 합하기
		
		int num;
		int tot = 0;
		
		for(num=0; num<=100; num++) {
			if(num % 2 == 0) {
				continue;
			}
			tot += num;
		}
		
		System.out.println("1 ~ 100 홀수값의 합" + tot);
		System.out.println("--------------------");
		System.out.println("1 ~ 20 홀수 추출");
		
		for(int num2=0; num2<=20; num2++) {
			if(num2 % 2 == 1) {
				System.out.println(num2);
			}
		}
		

	}

}
