package step01.syntax;

public class Ex02Operation {

	public static void main(String[] args) {
		// 연산 Operation
		
		// 1. 산술 (+, -, *, /, %)
		int v1 = 10;
		int v2 = 3;
		
		// 2. 증감 (++,--)
		v1++;
		
		// 형변환 Casting
		byte v3 = 10;
		byte v4 = 3;
		
		double v5 = (double)v3 / v4;	// 형 변환
		
		// 비교 (>, <, ==, != ...) 
//		System.out.println(v3 == v4);
		
		
		// 논리 (and&&, or||, not!)
		
		boolean isTrue = true;
		boolean isFalse = false;
		
//		System.out.println((isTrue || isFalse));
		
		
		// 대입 연산자(=, +=,-=, ...)
		
		int assign = 0;
		assign += 10;
		//		System.out.println(assign);
		
		// 삼항 연산(조건 ? 참: 거짓)
		double i = 10;
		System.out.println((i > 0 ? i : Math.abs(i)));
		
		
		
		
		
		
		
		
		

	}

}
