package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 통하여 초가화 
		Car ccr = new Car("흰색", 2000);
		System.out.println(ccr.getColor() + " " + ccr.getCc());
		
		//맴버변수 이용하려 하나씩 초기화
		Car cr = new Car();
		cr.color = "검정";
		cr.cc = 1000;
		
		//맴버변수에 직접 접근해서 초기화 후 출력
		
		System.out.println(cr.color + " " + cr.cc);
		
		//메소드를 이용한 출력
		System.out.println(cr.getColor() + " " + cr.getCc());
		
		
		
		
		
		
		
		

	}

}
