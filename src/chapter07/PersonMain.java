package chapter07;

public class PersonMain {

	public static void main(String[] args) {

		Person ps = new Person();
		System.out.println(ps.name="김유신");
		System.out.println(ps.height=180f);
		System.out.println(ps.weight=80f);

		System.out.println("---------------------");
		
		Person pss = new Person("강감찬");
		System.out.println(pss.name="김유신");
		System.out.println(pss.height=175f);
		System.out.println(pss.weight=75f);
		
		System.out.println("---------------------");
		
		Person pps = new Person("이순신", 170, 70);
		System.out.println(pps.name);
		System.out.println(pps.height);
		System.out.println(pps.weight);
	}

}
