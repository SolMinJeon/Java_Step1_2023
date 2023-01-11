package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		      168421
		int num = 0B00000101;
		//        0B00010100
		//        0B00000001
		System.out.println(num);
		
		System.out.println(num << 2);//증가
		System.out.println(num >> 2); //감소
		
		int a, b, c;
		a = 5;//0101
		b = 2;
		c = a >> b;
		System.out.println(c);
		
		c = a << b;
		System.out.println(c);

		
	}

}
