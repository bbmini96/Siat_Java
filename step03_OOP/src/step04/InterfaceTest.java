package step04;

public class InterfaceTest {

	public static void main(String[] args) {
		// 계산기 객체
		Calculator cal = new Calculator();
		int result = cal.add(10, 20);
		System.out.println(result);
		
		// 1) 여러개의 인터페이스를 같은 클래스에서 구현 가능*
		
		// 2) 인터페이스를 사용하는 경우 전체 시스템의 기능을 정확하게 파악 한 뒤에 구성 필요
		
		Calculate cal2 = new Calculator();
//		Calculate cal3 = new Calculate(); // 객체 생성X
		
		// 3) 인터페이스를 구현한 클래스가 있다면,
		//    인터페이스의 타입으로 객체 생성O
		//    인터페이스의 타입으로 인터페이스 객체 생성X
		
		/* ***추가)
		 * 1) 추상클래스 + 인터페이스 같이 사용 가능?
		 * => Yes
		 *
		 * 2) 같은 형태(메소드의 선언부)의 메소드가 있을때,
		 *    누구를 우선순위로 사용하는가?
		 * => 추상클래스의 메소드를 우선적으로 재정의한다!
		 * 
		 * 3) 추상클래스와 인터페이스도 다형성이 적용된다!
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
