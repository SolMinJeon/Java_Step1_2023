package chapter03.IF.SWITCH;

import java.util.Random;

public class SwitchCase05 {

	public static void main(String[] args) {
		
		System.out.println("주사위 점수 : ");
		
		int num = (int)(Math.random()*10)+1;
		
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(num + "점 휙휙");
			break;

		default:
			System.out.println("잘못된 숫자");
			break;
		}

	}

}
