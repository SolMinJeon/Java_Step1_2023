package chapter06;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cr = new Car();
		
		System.out.println("제작회사 : " + cr.company);
		System.out.println("모델명 : " + cr.model);
		System.out.println("색깔 : " + cr.color);
		System.out.println("최고속도 : " + cr.maxspeed);
		System.out.println("현재속도 : " + cr.speed);
		
		System.out.println("---------------------");
		
		cr.speed = 60;
		
		System.out.println("변경된 현재속도 : " + cr.speed);

	}

}
