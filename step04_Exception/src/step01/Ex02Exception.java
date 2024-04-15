package step01;

class Dev {

}

public class Ex02Exception {

	public static void main(String[] args) {
		// try ~ catch

		// Class 클래스 => 트라이 캐치로 사용하게 지정되어 있다
		try {
			// 클래스를 선택할 경우에는 패키지 명과 클래스 명을 같이 선택해야한다
			Class.forName("step01.Dev");
			
			String str = null;
			System.out.println(str.length());
			
			/*
			 * try 내부 exception 발생 순서와 catch 순서를 일반적 맞춰서 표현
			 * 여러 exception 하나의 catch로 처리하려면? muti-catch 사용
			 * Exception 처리 위치 *** (catch 맨 마지막)
			 */
			
		} 
		// 멀티 exception 처리
		catch (ClassNotFoundException | NullPointerException e) {
//			e.printStackTrace();
//			System.out.println("예외처리 msg");
//			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("모든 예외처리 코드 블럭");
		} finally {
			System.out.println("finally 코드 블럭");
		}
	}

}
