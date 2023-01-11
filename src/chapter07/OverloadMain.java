package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload obj1 = new Overload();
		obj1.dis();
		System.out.println();
		
		Overload obj2 = new Overload(22, 172.6f);
		obj2.dis();
		System.out.println();
		
		Overload obj3 = new Overload("이순신", 22, 172.6f );
		obj2.dis();
		System.out.println();

	}

}
