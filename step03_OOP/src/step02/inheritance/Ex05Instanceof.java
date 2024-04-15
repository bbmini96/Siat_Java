package step02.inheritance;

class A {}
class B extends A {}
class C extends A{}

public class Ex05Instanceof {

	public static void main(String[] args) {
		A b = new B(); // b객체를 A 타입 생성
		A c = new C(); // c객체를 A 타입 생성
		
		// instanceof
		/* - 객체 instanceof 타입 
		 * 
		 */
		System.out.println(b instanceof A); // t
		System.out.println(b instanceof B); // t
		System.out.println(b instanceof C); // f
		
		System.out.println();
		
		System.out.println(c instanceof A); // t
		System.out.println(c instanceof B); // f
		System.out.println(c instanceof C); // t
		
		System.out.println();
		
		B b2 = new B();
		
		System.out.println(b2 instanceof A); // t
		System.out.println(b2 instanceof B); // t
//		System.out.println(b2 instanceof C); // 에러 :  
		
	}

}
