package chapter04.Example;

public class Example2 {

	public static void main(String[] args) {
		// 회원가입은 0번부터 회원번호가 부여된다 현재 부여된 다음의 번호중 가장 큰 회원번호를 출력하시오
		
		int max = 0;
		int arr[] = {1, 6, 9, 2, 35, 178, 234, 4, 5, 11};
		
		//최대값 알고리즘
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);

	}

}
