package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		try {
			System.out.println(num1 / num2); //해당 작업 코드
		} catch (ArithmeticException e) {
			System.out.println("숫자 0을 입력하시면 안됩니다");//에러시 수행되어야 할 코드
		}
		
		System.out.println("Error 후 컴파일 => 프로그램 종료");

	}

}
