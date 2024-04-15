package step03.singleton;

// 싱글톤 패턴
public class Log {
	private static Log instance;
	
	private Log() {}
	
	public static Log getInstance() {
		if(instance == null) {
			instance = new Log();
		}
		return instance;
	}
	// 기능
	// 로그인 성공시 기록
	public void logSuccess() {
		System.out.println("로그인 성공");
	}
	// 로그인 실패시 기록
	public void logFail() {
		System.out.println("로그인 실패");
	}
}
