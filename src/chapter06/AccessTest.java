package chapter06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AccessTest {
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void disp() {
		System.out.println("aa값 : " + aa + "\nbb값 : " + bb + "\ncc값 : " + cc);
	}

	public static void main(String[] args) {
		// 객체(obj)
		
		AccessTest obj = new AccessTest();
		
		Scanner sc = new Scanner(System.in);
		
		obj.aa = Integer.parseInt(JOptionPane.showInputDialog("aa 입력"));
		obj.bb = sc.nextInt();
		obj.cc = 30;
		
		obj.disp();

	}

	

}
