package step03;

/*
 * Computer -(상속)-> DeskTop, LapTop 클래스 생성
 */
public abstract class Computer {
	
	// 필드(static)
	static int MAXIUM_CORE = 8;
	
	// 공통의 기능 display()
	public void display() {
		System.out.println("display 출력");
	}
	
	// 추상메소드화 : 반드시 재정의 후 사용해야 하는것을 정의, 추상클래스 내부에서만 사용가능
	public abstract void typing();
	
	
}
