package chapter03.IF.WHILE;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		while(true) {
			
			int num = (int)(Math.random()*6)+1;
			
			System.out.println("주사위의 눈 : " + num);
			
			if(num == 6) {
				break;
			}
			
		}
		
	}

}
