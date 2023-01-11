package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		
		//메소드를 통해서 팀명을 초기화
		t.setTeamName("teamHUB");
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("--------[팀원 명단]----------");
		team.init();
		team.dis();
		
		System.out.println();
		
		t.setmName("허초회");
		t.setMphone("010-1234-5678");
		t.setsName("윤영훈");
		
		System.out.println("팀장 성명: " + t.getmName());
		System.out.println("팀장 번호 : " + t.getMphone());
		System.out.println("부팀장 성명 : " + t.getsName());

	}

}
