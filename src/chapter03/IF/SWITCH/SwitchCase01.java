package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		int ranking = sc.nextInt();
		
		int ranking = 3;
		char medalColor;
		
		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		
		case 2:
			medalColor = 'S';
			break;
			
		case 3:
			medalColor = 'B';
			break;

		default: //나머지 value 값
			medalColor = 'A';
			break; //없어도됨
		}
		
		System.out.println(ranking + "등 메달은 " + medalColor);

	}

}
