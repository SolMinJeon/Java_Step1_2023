package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String select ="";
		int money =0;
		Vending ven = new Vending();
		ven.init();
		
		System.out.print("돈을 투입하세요 : ");
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		ven.showCanS(money);
		
		System.out.print("음료를 선택하세요 : ");
		select = sc.next(); //음료종류 선택
		ven.outCan(select);
		

	}

}
