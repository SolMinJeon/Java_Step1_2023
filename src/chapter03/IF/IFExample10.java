package chapter03.IF;

import javax.swing.JOptionPane;

public class IFExample10 {

	public static void main(String[] args) {
		
		String ID = "soldesk"; //인스턴스 변수
		int PW = 221227; //정수형 변수, 실수형 문자형
		
		String id = JOptionPane.showInputDialog("아이디");
		int pw = Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
		
		if(ID.equals(id)) {
			if(PW == pw) {
				System.out.println("soldesk님 환영합니다");
//				JOptionPane.showMessageDialog(null, "soldesk님 환영합니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}

	}

}
