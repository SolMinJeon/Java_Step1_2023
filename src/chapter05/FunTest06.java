package chapter05;

public class FunTest06 {
	//heap
	public String channel; //멤버변수
	public int channelint; //멤버변수
	public int volume; //멤버변수
	
	//생성자 생략
	
	//void 외에 모든 타입의 메소드는 반드시 꼭 return값을 갖는다
	//stack
	public int channelup(int volume) {
		
		this.volume = volume;
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
		
	}
	
	public void channeldown(int volume) {
		
		this.volume = volume;
		System.out.println("소리를 높이겠습니다.");
		//return volume+2; //void는 절대 return값이 존재할 수 없다
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunTest06 wasd = new FunTest06();
		
		//방법1
		System.out.println("소리를 " + wasd.channelup(9) + "만큼 올립니다");
		
		//방법2
		int volume = wasd.channelup(9);
		System.out.println("소리를 " + volume + "만큼 올립니다");
		wasd.channeldown(5);

	}

}
