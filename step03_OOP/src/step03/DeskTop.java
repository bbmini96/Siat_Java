package step03;

public class DeskTop extends Computer {
	
	// 자신만의 display 기능 개발
	
	@Override
	public void display() {
		System.out.println("DeskTop display 출력");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing 타이핑");
	}
}
