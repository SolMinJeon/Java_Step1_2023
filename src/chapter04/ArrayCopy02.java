package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		Book bookArray1[] = new Book[3]; 
		Book bookArray2[] = new Book[3]; 
		
		bookArray1[0]=new Book("데미안", "헤르만 헤세");
		bookArray1[1]=new Book("빨간머리앤", "몽고메리");
		bookArray1[2]=new Book("백설공주", "그림형제");
		
		System.out.println("-----------원본(bookArray1)-----------");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
	
		//복사			 복사배열	    번째 붙일배열      번째 갯수
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		System.out.println("-----------복사(bookArray2)-----------");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}
		
		System.out.println();
		
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완선");
		
		System.out.println("-----------원본변경(bookArray1)-----------");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
		//얕은복사
		System.out.println("-----------복사본변경(bookArray2)-----------");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}
		
		/*
		System.out.println("-----------원본스캔(bookArray1)-----------");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].inputbook();
		}
		*/
		
		System.out.println("-----------원본변경2(bookArray1)-----------");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}

	}

}
