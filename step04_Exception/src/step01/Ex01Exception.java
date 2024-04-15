package step01;

class A {}
class B extends A {}
class C extends A {}

public class Ex01Exception {

	public static void main(String[] args) {
		// 예외(Exception)
		
		// NPE
//		String str1 = null;
//		System.out.println(str1.length());
		
		// FormatException
//		String str10 = "ten";
//		System.out.println(Integer.parseInt(str10));
		
		// OutofBoundsException
//		int[] arr1 = {1,2,3};
//		System.out.println(arr1[3]);
	
		// CastException
//		A b = new B();
//		C c = (C)b;
		
		// ArithmeticException
		System.out.println(10 / 0);
		
		
	}

}
