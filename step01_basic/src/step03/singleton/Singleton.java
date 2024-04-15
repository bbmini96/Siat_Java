package step03.singleton;

public class Singleton {
//	private static 변수
	private static Singleton instance = new Singleton();
	
	// private 생성자
	private Singleton() {}
	
	// public getInstance 메소드
	public static Singleton getInstance() {
		return instance;
	}
}
