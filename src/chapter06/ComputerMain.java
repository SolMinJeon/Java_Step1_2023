package chapter06;

public class ComputerMain {
	
	public static void main(String[] args) {
		
		Computer mycom = new Computer();
		
		//방법1
		int values1[] = {1, 2, 3};
		
		int result = mycom.sum1(values1);
		System.out.println("result1 : " + result);
		
		//방법2
		int result2 = mycom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 : " + result2);
		
		//방법3
		int result3 = mycom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);
		
		//방법4
		int result4 = mycom.sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("result4 : " + result4);
	}

}
