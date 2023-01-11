package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		// 필드를 이용하여 set
		
		Student st1 = new Student();
		st1.studentName = "김치";
		st1.address = "서울시 종로구";
		st1.showStudentInfo();
		System.out.println("-------------------------");
		
		//메소드릉 이용하여 set
		Student st2 = new Student();
		st2.setStudentName("박수");
		st2.setAddress("경기도 고양시");
		st2.showStudentInfo();
		System.out.println("-------------------------");
		
		//생성자 오버로딩
		Student st3 = new Student("김치즈", "서울시 은평구");
		st3.showStudentInfo();
		System.out.println("-------------------------");
		

	}

}
