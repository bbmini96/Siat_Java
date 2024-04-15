package step03;

public class ComputerTest {
	public static void main(String[] args) {
		// 1) 추상클래스는 추상클래스 타입으로 객체 생성 X
//		Computer computer = new Computer();
		
		// 2) 추상클래스 내부의 변수(필드)는 static 사용
		
		Computer deskTop = new DeskTop();
		deskTop.display();
		/*
		 * typing 반드시 자식 클래스에서 재정의후, 사용해야하는 메소드
		 * 현재는 재정의 없이도 사용이 가능하다!! 이것이 문제가 될 수 있다!
		 * 자식 클래스에서 반드시 재정의 후 사용해야하는 메소드를 지정하려면 -> 추상메소드!
		 * *추상메소드 : 코드블럭없이 메소드의 선언부, abstract -> 재정의를 필수
		 * 
		 */
		
		deskTop.typing();
		
		System.out.println();
		
		Computer lapTop = new LapTop();
		lapTop.display();
		
	}
}
