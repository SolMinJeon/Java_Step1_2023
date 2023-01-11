package chapter03.IF.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 오전 9 ~ 오후 6
		
		int time=(int)(Math.random()*10)+9;
		
		System.out.println("[현재시간 : " + time + "시]");
		System.out.print("할 일 : ");
		
		switch (time) { //18
		//case 1, 2, 3, 4, 5: 14이후 버전 
		case 9:
			System.out.println("오전수업듣기");
			break;
		case 10:
			System.out.println("오전수업듣");
			break;
		case 11:
			System.out.println("오전수업");
			break;
		case 12:
			System.out.println("오전수");
			break;
		case 13:
			System.out.println("점심");
			break;
		case 14:
			System.out.println("식사");
			break;
		case 15:
			System.out.println("오후수업듣기");
			break;
		case 16:
			System.out.println("오후수업듣");
			break;
		case 17:
			System.out.println("오후수업");
			break;
		case 18:
			System.out.println("오후수");
			break;
		default:
			System.out.println("잠자기");
			break;
		}

	}

}
