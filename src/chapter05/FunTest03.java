package chapter05;

public class FunTest03 {
	
	public static void swap(int x, int y) {
		//교체 알고리즘
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("swap() 결과값 : x = " + x +", y " + y);
		
	}
	
//	public int sw(int x, int y) {
//		int temp = x;
//		x = y;
//		y = temp;
//		
//		return x;
//		return y;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20;
		
		System.out.println("swap() 호출 전 : a = " + a +", b " + b);
		System.out.println("------------------------------------");
		swap(a, b);
		System.out.println("------------------------------------");
		System.out.println("swap() 호출 후 : a = " + a +", b " + b);

	}

}
