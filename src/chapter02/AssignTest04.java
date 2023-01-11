package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// 전위연산

		System.out.println("-----전위연산-----");
		
		int gamescore = 150;
//		int lastscore = gamescore + 1;
		int lastscore1 =++ gamescore; //더한후 대입
		
		System.out.println(lastscore1); //151
		
		int lastscore2 =-- gamescore;
		System.out.println(lastscore2); //150
		
		
		
		// 후위연산

		System.out.println("-----후위연산-----");
		
		int lastscore3 = gamescore++; //읽고 대입후 더하기
		
		System.out.println(lastscore3); //150
		System.out.println(gamescore); //151
		System.out.println("--------------------------------");
		
		int lastscore4 = gamescore--;
		System.out.println(lastscore4); //151
		System.out.println(gamescore); //150

	}

}
