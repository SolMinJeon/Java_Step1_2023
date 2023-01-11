package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "010-1234-5678");
		System.out.println(k1.nation + " " + k1.name + " " + k1.ssn);
		
		System.out.println("-------------------------------------");
		
		Korean k2 = new Korean("김자바", "010-9876-5432");
		k2.nation = "일본";
		System.out.println(k2.nation + " " + k2.name + " " + k2.ssn);

	}

}
