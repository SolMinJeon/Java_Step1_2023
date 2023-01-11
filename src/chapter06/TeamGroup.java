package chapter06;

public class TeamGroup {
	
	private TeamMember member[] = new TeamMember[6];
	
	
	//기본생성자
	
	//초기화 메소드
	public void init() {
		member[0] = new TeamMember("허초회", "남");
		member[1] = new TeamMember("김찬희", "남");
		member[2] = new TeamMember("윤영훈", "남");
		member[3] = new TeamMember("이재민", "남");
		member[4] = new TeamMember("전솔민", "남");
		member[5] = new TeamMember("장여주", "여");
	}
	
	//출력 메소드
	public void dis() {
		for(int i=0; i<member.length; i++) {
			System.out.println("성명 : "+member[i].getName() + " 성별 : " + member[i].getGender());
		}
	}

}
