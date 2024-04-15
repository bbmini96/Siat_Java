package step03;

public class LapTop extends Computer {
	
	// 자신만의 display 기능 개발
	
	@Override
	public void display() {
		System.out.println("LapTop display 출력");
	}

	@Override
	public void typing() {
		System.out.println("LapTop typing 타이핑");
	}
}
