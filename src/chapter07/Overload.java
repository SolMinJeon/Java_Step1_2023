package chapter07;

public class Overload {
	
	private String name;
	private int age;
	private float h;
	
	public Overload() {
		name = "익명";
		age = 0;
		h = 0;
	}
	
	public Overload(int a, float f) {
		
		age = a;
		h = f;
		name = "익명";
	}
	
	public Overload(String n, int a, float f) {
		
		age = a;
		h = f;
		name = n;
	}
	
	public void dis() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + h);
	}


}
