package step01;

public class Ex03Exception {

	// throws
	public static void throwingTest() throws NullPointerException{
		System.out.println("로직 수행중, 예외 발생 메소드");
		// 원래대로라면, 내부에서 try ~ catch로 반드시 예외를 처리
		throw new NullPointerException("NPE");

	}
	
	public static void main(String[] args) {
		try {
			
			throwingTest();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
