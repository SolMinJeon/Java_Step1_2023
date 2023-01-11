package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);
		StdInfo studentJohn = new StdInfo("John", 0);
		
		//버스타기
		System.out.println("제임스 버스 100");
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		//정보확인
		studentJames.showInfo(); //지출
		bus100.showInfo(); //수입증가 인원수 증가
		
		System.out.println("===============================================");
		
		
		//지하철
		System.out.println("톰 지하철 1호선");
		Subway subway1 = new Subway("1호선");
		studentTom.takeSubway(subway1);
		studentTom.showInfo();
		subway1.showInfo();
		System.out.println("톰 버스 100");
		studentTom.takeBus(bus100);
		studentTom.showInfo();
		bus100.showInfo();
		
		System.out.println("===============================================");
		System.out.println("존 버스 200");
		Bus bus200 = new Bus(200);
		studentJohn.takeBus(bus200);
		studentJohn.showInfo();
		bus200.showInfo();
		System.out.println("존 지하철 1호선");
		studentJohn.takeSubway(subway1);
		studentJohn.showInfo();
		subway1.showInfo();
		System.out.println("존 버스 100");
		studentJohn.takeBus(bus100);
		studentJohn.showInfo();
		bus100.showInfo();

	}

}
