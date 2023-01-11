package chapter03.IF.FOR;

public class ForTest01 {

	public static void main(String[] args) {
		// 1 ~ 10의 합
		
		int sum = 0;
		
		System.out.println("1부터 10까지의 수 출력");
		System.out.println("i   sum 합계");
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " + " + sum + " = ");
			sum = sum + i;
			System.out.println(sum);
		}
		
		System.out.println("1부터 10까지의 합 : " + sum + "입니다");

	}

}
