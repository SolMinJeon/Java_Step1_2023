package chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5]; //Fixed-length
		
		int b[];
		b = new int[5];
		
		int aVal;
		int bVal;
		int tot;
		
		args = new String[2];
		args[0] = "1"; //[0] : 첨자 / 1 : 요소
		args[1] = "2";
		
		String  str [];
		str = new String[10];
		
		//length : 배열의 첨자수
		if(args.length == 2) {
			aVal = Integer.parseInt(args[0]);
			bVal = Integer.parseInt(args[1]);
		} else {
			aVal = 0;
			bVal = 0;
		}
		
		tot = aVal + bVal;
		System.out.println(tot);
		
	}

}
