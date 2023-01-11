package chapter03.IF;

import javax.swing.JOptionPane;

public class IFExample09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("num1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("num2"));
		
		if(num1 > num2) {
			System.out.println("num1이 큽니다");
		} else if(num1 < num2) {
			System.out.println("num2가 큽니다");
		} else {
			System.out.println("그 밖에 두 수는 같습니다");
		}
		

	}

}
