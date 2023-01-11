package chapter04;

public class CharArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha[] = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = ch++;
			System.out.println(alpha[i]);
		}
		

	}

}
