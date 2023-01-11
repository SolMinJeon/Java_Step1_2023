package chapter05;

public class FunTest05 {
	
	public String channel; //멤버변수
	public int channelint; //멤버변수
	public int volume; //멤버변수
	
	//생략이 가능
	public FunTest05() {
		// TODO Auto-generated constructor stub
	}
	
	public void channelup(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다");
	}
	
	public void channeldown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다");
	}
	
	//오버로딩(다형성 만족)
	public void channelchange(String channel) {
		System.out.println("채널을 " + channel + "로 바꿉니다");
	}
	
	public void channelchange(int channelint) {
		System.out.println("채널을 " + channelint + "로 바꿉니다");
	}

	public static void main(String[] args) {
		
		int a = 1;
		String b = "w";
		
		FunTest05 asd = new FunTest05();
		asd.channelup(a);
		asd.channeldown(a);
		asd.channelchange(b);
		asd.channelchange(a);

	}

}
