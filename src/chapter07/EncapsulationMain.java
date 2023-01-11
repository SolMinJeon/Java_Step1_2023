package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int area;
		
		side = Integer.parseInt(JOptionPane.showInputDialog("side"));
		height = Integer.parseInt(JOptionPane.showInputDialog("height"));
		
		//객채생성
		Encapsulation en = new Encapsulation();
		
		//Encapsulation의 메소드를 사용하여 삭ㄱ형의 넓이 구하기
		area = en.Cal_Area(side, height);
		System.out.println("사각형의 넓이 : " + area);
		String str = "사각형의 넓이 : " + area;
		JOptionPane.showMessageDialog(null, str);

	}

}
