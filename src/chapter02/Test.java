package chapter02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Q1-----");
		byte a1 = 10;
		int a2 = a1;
		long a3 = a1;
		System.out.print(a2);
		System.out.println(" / Type : " + ((Object)a2).getClass().getSimpleName());
		System.out.print(a3);
		System.out.println(" / Type : " + ((Object)a3).getClass().getSimpleName());
		
		System.out.println("-----Q2-----");
		double b1 = 3.14;
		int b2 = (int)b1;
		System.out.print(b2);
		System.out.println(" / Type : " + ((Object)b2).getClass().getSimpleName());
		
		float b3 = 2.14f;
		int b4 = (int)b3;
		System.out.print(b4);
		System.out.println(" / Type : " + ((Object)b4).getClass().getSimpleName());
		
		System.out.println("-----Q3-----");
		System.out.println("부동소수점");
		
		System.out.println("-----Q4-----");
		int d1 = 10;
		double d2 = 2.5;
		System.out.println((int)(d1 + d2));
		System.out.println((int)(d1 - d2));
		System.out.println((int)(d1 * d2));
		System.out.println((int)(d1 / d2));
		
		System.out.println("-----Q5-----");
		int e1 = 44544;
		char e2 = (char)e1;
		System.out.print(e2);
		System.out.println(" / Type : " + ((Object)e2).getClass().getSimpleName());
	}

}
