package chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		
		//Book(); 5번 호출
		Book[] library = new Book[5];
		
		library[0] = new Book("데미안", "헤르만");
		library[1] = new Book("개미", "베르나르");
		library[2] = new Book("ㅈ", "ㅈ");
		library[3] = new Book("ㅁ", "ㅁ");
		library[4] = new Book("ㄴ", "ㄴ");
		
		
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		
		/*for(int i=0; i<library.length; i++) {
			library[i].setBookname(inputb());
			library[i].setAuthor.inputa();
			System.out.println();
		}
		System.out.println("000000000000000000000000000");*/
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfo();
			System.out.println();
		}
		
		

	}

	private static Book inputbook() {
		// TODO Auto-generated method stub
		return null;
	}

}
