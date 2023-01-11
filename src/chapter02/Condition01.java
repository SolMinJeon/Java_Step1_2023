package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 15;
		boolean result;
		
		result = ++a >= b ? true : false; // : 기준 1 왼 0 오
		System.out.println(result);
		
		int num1 = 10;
		int num2 = 20;
		char result2;
		
		result2 = (++num1 == num2) ? 'Y' : 'N';
		System.out.println(result2);
		

	}

}
