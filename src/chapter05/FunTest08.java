package chapter05;

public class FunTest08 {
	
	//재귀함수
	
	//디폴트 생성자
	
	//메소드 : 재귀함수
	public static int recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		if(a == 1) {
			return (1);
		} else {
			result = a * recur(a-1);
		}
		
		//return (1); //정상종료는 아니지만 오류없이 끝남
		//return 0; //정상종료 되었으나 넘어갈 값이 없음
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		System.out.println("메소드 호출");
		int res = recur(x);
		System.out.println();
		System.out.println("1 ~ " + x + "까지의 수를 곱한 값 : " + res);

	}

}
