package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		// for 문을 이용하뎌 다음 배열의 점수를 줄단위로 평균을 구하시오
		int arr[][] = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		
		
		int cnt = 0;
		int total = 0;
		int sum = 0;
		int count = 0;
		double avg = 0;
		
		
		/*for(int i=0; i<arr.length; i++) {
			
			
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				count += 1;
				cnt += 1;
			}
			total += sum;
			System.out.print((i+1) + "번째줄의 ");
			System.out.print("합 : " + sum);
			avg = (double)sum / count;
			System.out.println("  |  평균 : " + avg);
			
			sum = 0;
			count = 0;
			avg = 0;
			
		}
		
		System.out.println("총합 : " + total);
		System.out.println("전체평균 : " + ((double)total / cnt));*/
		//System.out.println("전체평균 : " + Math.round(avg));
		//System.out.println(String.format("전체 평균 : %.2f", allavg));
		
		for(int[] num:arr) {
			for(int score : num) {
				total += score;
			}
			count++;
			System.out.println(count + "번째 학생의 합계 : " + total);
			total=0;
		}

	}

}
