package chapter03.IF;

import javax.swing.JOptionPane;

public class IFExample05 {

	public static void main(String[] args) {
		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원	7
		// 전시관의 입장료는 중.고등학생은 3500원	14
		// 전시관의 입장료는 성인은 5000원	20
		
		int age;
		int cash;
		String a;
		
		age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
		
		if (age > 0 && age < 8) {
			cash = 1000;
			a = "미취학 아동";
		} else if(age >= 8 && age < 14) {
			cash = 2000;
			a = "초등학생";
		} else if(age >= 14 && age < 20) {
			cash = 3500;
			a = "중.고등학생";
		} else {
			cash = 5000;
			a = "성인";
		}
		System.out.println(a + "입니다.");
		System.out.println("나이가 " + age + "살 이므로 입장료는 " + cash +"원 입니다.");

	}

}
