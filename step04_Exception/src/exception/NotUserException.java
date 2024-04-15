package exception;

// 사용자 정의 예외 생성시, Exception 최상위 예외 클래스를 반드시 상속!
public class NotUserException extends Exception {
//	String msg;
	
	public NotUserException(String msg) {
//		this.msg = msg;
		super(msg);
		
	}
}