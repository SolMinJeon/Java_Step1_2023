package chapter02;

public class AssignTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aVal = 20;
		System.out.println("aVal = aVal + 10 : " + (aVal += 10));
		//aVal = 30
		System.out.println("aVal = aVal - 10 : " + (aVal -= 10)); //aVal = aVal - 10
		
		//aVal = 30;
		System.out.println("aVal = aVal * 10 : " + (aVal *= 10)); //aVal = aVal * 10
		
		//aVal = 30;
		System.out.println("aVal = aVal / 10 : " + (aVal /= 10)); //aVal = aVal / 10
		
		aVal = 30;
		System.out.println("aVal = aVal % 4 : " + (aVal %= 4)); //aVal = aVal % 4
		
		

	}
}
