package chapter03.IF;

class clsA {
	void fun() {
		System.out.println("2023년 1월 첫주 월요일 입니다");
	}
}

class clsB extends clsA {
	
}

public class InsTest {

	public static void main(String[] args) {
		// clsB의 인스턴스 변수
		clsB objB=new clsB();

		if(objB instanceof clsA) {
			System.out.println("yes");
			objB.fun();
		} 
		
		if(objB instanceof clsB ) {
			System.out.println("yes");
		}

	}

}
