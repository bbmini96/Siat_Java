package step02.inheritance;

class Parent3 extends Object {
	String name;
	
	// 오버라이딩 규칙 
	/*
	 * 1) 부모의 메소드명 같음
	 * 2) 부모의 메소드 파라미터 같음
	 * 3) 부모의 메소드 리턴타입 같음
	 */
	// 어노테이션 Annotation 
	@Override
	public String toString() {
		return "name : " + name;
	}
}

class Child3 extends Parent3 {
	String wish;
	
	@Override
	public String toString() {
		return "name : " + name + ", wish : " + wish;
	}
}

public class Ex03Overriding {

	public static void main(String[] args) {
		
		Parent3 p3 = new Parent3();
		p3.name = "Java";
		System.out.println(p3.toString());
		// 출력 : 객체 주소값 -> name값 출력?
		//     => Overriding
		
		// Child3 c3 -> syso(c3) => "name : Java.JR, wish : DEV" 출력하려면?
		Child3 c3 = new Child3();
		c3.name = "Java.JR";
		c3.wish = "DEV";
		System.out.println(c3);
		
		System.out.println("---");
		// if) Parent3 = Child3();
		Parent3 c4 = new Child3();
		System.out.println(c4);
		// name만 출력 될것이다 예상 => wish 출력 결과
		
		/*
		 * 자식객체가 부모타입으로 생성 되었다 하더라도
		 * 자식클래스에서 오버라이딩된 메소드가 있다면,
		 * 부모의 메소드가 아닌 자식의 오버라이딩 메소드를 호출
		 */
		
	}

}
