package chapter06;

public class Vending {
	
	//맴버변수
	private Can can[] = new Can[5];
	private int money;
	
	//can[0] = new Can("환타", 1000); //private 변수방이므로 반드시 메소드안에서 초기화 한다
	
	//메소드
	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("사이다", 1200);
		can[2] = new Can("오렌지쥬스", 1100);
		can[3] = new Can("바나나우유", 1400);
		can[4] = new Can("콜라", 900);
	}
	
	//사용 가능한 음료만 보여주기
	public void showCanS(int m) {
		
		money = m;
		
		for(int i=0; i<can.length; i++) {
			if(money >= can[i].getPrice()) {
				String a = can[i].getCanName();
				//System.out.println(can[i].getCanName());
				int b = can[i].getPrice();
				System.out.println(a + ", "+ b);
			}
		}
		//System.out.println("asd");
		
	}
	
	public void outCan(String name) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "을 선택하셨습니다");
				System.out.println("잔액 : " + (money - can[i].getPrice()));
			}
		}
	}

}
