package chapter03.IF;

import javax.swing.JOptionPane;

public class IFExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade;
		int jumsu;

		jumsu = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		/*
		 * if(jumsu >= 90) { System.out.println("A"); } else if(jumsu >= 80) {
		 * System.out.println("B"); } else if(jumsu >= 70) { System.out.println("C"); }
		 * else if(jumsu >= 60) { System.out.println("D"); } else {
		 * System.out.println("F"); }
		 * 
		 * System.out.println("좀 더 노력하세요");
		 */
		if (jumsu >= 90) {
			grade = 'A';
			System.out.println("최우수 학생입니다");
		} else if (jumsu >= 80) {
			grade = 'B';
			System.out.println("우수 학생입니다");
		} else if (jumsu >= 70) {
			grade = 'C';
		} else if (jumsu >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 : " + grade);
	}

}
