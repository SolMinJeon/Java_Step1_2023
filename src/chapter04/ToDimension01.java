package chapter04;

public class ToDimension01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[2][3];
		/*
		 0,0	0,1		0,2
		 1,0	1,1		1,2
		 */
		
		int n = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				n++;
				System.out.print((arr[i][j] = n) + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println("---------------------------");
		
		int arr1[][] = { {1, 2, 3}, {4, 5, 6} };
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
