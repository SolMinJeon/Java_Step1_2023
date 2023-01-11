package chapter03.IF.FOR;

public class ForTest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k=2; k<=9; k++) {
			System.out.print("["+k+"단"+"]"+"\t");
		}
		System.out.println();
		
		for(int i=1; i<10; i++) {
			
			for(int j=2; j<10; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+" \t");
			}
			System.out.println();
		}

	}

}
