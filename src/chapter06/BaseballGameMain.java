package chapter06;

public class BaseballGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String check = "";
		BaseballGame game = new BaseballGame();
		
		//game.check();
		
		do {
			check = game.check();
		} while (check != "WIN");

	}

}
