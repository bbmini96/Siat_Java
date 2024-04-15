package step04;

// 계산기
public class Calculator implements Calculate, Connect {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public void connect() {
		System.out.println("계산기 연결");
	}
	
	// 연산 외의 기능 정의 사용해야 한다면?
	// connect -> 다른 외부에서도 사용할 수 있게끔? => interface로 생성

	
	/* 
	 * add기능 클래스 내부뿐 아니라 다른 외부의 클래스에서도 해당 기능 정의 사용
	 * -> interface로 생성
	 * 
	 * Interface : Calculate
	 * 	- add 기능 정의
	 * 
	 */
	
	
}
