package chapter06;

public class Bus {
	
	//맴버
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //승객이 낸 돈
		this.money += money; //버스의 수입 증가
		passengerCount++; //승객 수
	}
	
	public void showInfo() { //버스의 정보를 출력
		System.out.println("버스 번호 : " + busNumber + "번의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
		
	}

}
