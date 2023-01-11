package chapter02;

public class Logic_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a, b;
		boolean c;
		
		a = 'A';
		b = 'B';
		c = (true || true) && false;
		System.out.println(c);
		
		c = a > b && (a == b);
		System.out.println(c);
		System.out.println("-------------------");
		
		c = a < b || (a == b);
		System.out.println(c);
		System.out.println("-------------------");

	}

}
