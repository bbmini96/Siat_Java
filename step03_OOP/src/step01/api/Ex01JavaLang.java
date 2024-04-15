package step01.api;

import java.util.Arrays;

class Dev {
	public int devNum;
	
	public Dev(int devNum) {
		this.devNum = devNum;
		System.out.println("Dev : " + devNum + " 객체 생성");
	}
	
	// 해당 객체 메모리에서 삭제시 자동으로 호출 메소드
	public void finalize() {
		System.out.println("Dev : " + devNum + " 객체 삭제");
	}
}

public class Ex01JavaLang {

	public static void main(String[] args) {
		// ***Object : 모든 클래스의 최상위 클래스
		
		Object obj1 = new Object();
		// toString() : 객체 정보(주소) 출력(자동 호출)
//		System.out.println(obj1.toString());
		
		// hashcode() : 주소값 -> 정수 출력
//		System.out.println(obj1.hashCode());
		
		Object obj2 = new Object();
//		System.out.println(obj2);
		
		// obj1 vs obj2
		// equals() : 같은 객체 여부 확인
//		System.out.println(obj1 == obj2); // false
//		System.out.println(obj1.equals(obj2)); // false
		
		// System
		// getProperty() : 시스템 환경 변수
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("java.runtime.name"));
//		System.setProperty(null, null);
//		System.out.println(System.getProperties());
		
		// gc() : 가비지 컬렉터 직접 호출
//		Dev dev;
//		
//		dev = new Dev(1);
//		dev = null;
//		dev = new Dev(2);
//		dev = new Dev(3);
//		
//		System.gc();
		
		
		// String : 문자열 집합
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		String str4 = new String("String");
		
		// == 객체의 주소값을 비교
//		System.out.println(str1 == str2); // true
//		System.out.println(str3 == str4); // false
//		System.out.println(str1 == str3); // false 
//		System.out.println(str1 == str4); // false
		
		// equals() 
		// Object.equals() : 객체의 주소값 비교
		// String.equals() : 문자열 객체가 갖고 있는 문자열값
//		System.out.println(str1.equals(str2)); // true
//		System.out.println(str3.equals(str4)); // false -> true
//		System.out.println(str1.equals(str3)); // false -> true
//		System.out.println(str1.equals(str4)); // false -> true
		
		// charAt(index) : 해당 index 문자 반환
		String str5 = "Java API";
//		System.out.println(str5.charAt(3));
//		System.out.println(str5.charAt(8)); // IndexOutOfBounds
		
		// length() : 문자열 객체 길이 반환
//		System.out.println(str5.length());
		
		// indexOf() : 지정 문자열이 존재하는 가장 첫번째 index 반환
//		System.out.println(str5.indexOf("a"));
		
		// contains() : 지정 문자열 존재 여부 확인
//		System.out.println(str5.contains("j"));
		
		// toXXXCase()
		// lower/upper
//		System.out.println(str5.toLowerCase());
		
		// substring(start, end) : 지정 index 범위내의 문자열 반환
//		System.out.println(str5.substring(3, 5));
		
		// toCharArray() : 문자배열 반환
//		System.out.println(str5.toCharArray());
		
		// split() : 특정 문자 기준으로 배열 반환
		String splitStr = "Java-API-Split-Test";
//		System.out.println(Arrays.toString(splitStr.split("-")));
		
		// replace(oldStr, newStr)
//		System.out.println(str5.replace("java", "JAVA"));
		
		// trim() : 빈 공백 제거
		String trimStr = "  		Java API  		";
//		System.out.println(trimStr.trim());
		
		// String Buffer
		StringBuffer sb = new StringBuffer("StringBuffer");
//		System.out.println(sb.getClass());
		
		// *** String 		vs StringBuffer/StringBuilder
		// 불변(read-only) vs 가변
		// 불변객체 Immutable
		// 객체 생성 후, 객체 상태 변경되지 않는 객체
		
		String string = "abc";
		
		// def 문자열 추가 출력
//		System.out.println("before : " + string.hashCode());
		string += "def";
//		System.out.println("after : " + string.hashCode());
//		System.out.println(string);
		
		System.out.println("---");
		
		StringBuffer stringBuffer = new StringBuffer("abc");
//		stringBuilder
		// def 문자열 추가 출력
//		System.out.println("before : " + stringBuffer.hashCode());
		stringBuffer.append("def");
//		System.out.println("after : " + stringBuffer.hashCode());
//		
//		System.out.println(stringBuffer);
		
		/*
		 * 불변객체
		 * - 종류 : String, Long, Float, Boolean, Integer, ...
		 * - 이유 
		 * 		1) 값의 변경 방지
		 * 		2) 스레드의 안정성
		 * - 구현
		 * 		1) ex. setter 사용 x
		 * 		2) final (상속x, 상수 활용)
		 */
		
		// valueOf(primitive value) : 기본타입 -> 문자열 반환
//		System.out.println(String.valueOf(1).getClass());
		
		// 문자열 -> Wrapper 클래스 -> 기본타입??
		// Wrapper : 기본타입의 자료값을 객체로 다루기 위한 클래스
		// 8개 -> 기본타입에서 앞의 글자 대문자로 표현
		// 추가) Number : BigInteger, BigDecimal 
		
		// Boxing : 기본타입 -> 객체타입
//		Integer i1 = new Integer(10); // 명시적 boxing
		Integer i1 = 10; // 암시적 boxing -> auto boxing
//		System.out.println(i1.getClass());
		
		// Unboxing : 객체타입 -> 기본타입 (Wrapper 클래스 메소드)
//		int i2 = i1.intValue(); // 명시적 unboxing
		int i2 = i1; // 암시적 unboxing -> auto unboxing
//		System.out.println(i2);
		
		// 문자열 객체 타입 -> Wrapper -> 기본타입
		// parseXXX()
		String str10 = "10";
		System.out.println(Integer.parseInt(str10));
		
		String strTrue = "True";
		System.out.println(Boolean.parseBoolean(strTrue));
		
		// parse 할때는 NumberFormatException 주의!
		
		/*
		 * Wrapper 필요성
		 * 	1) 객체만 처리하는 경우가 존재(ex. java.util)
		 *  2) java 타입 인식 기본타입은 사용할 수 없음(ex. Collection Framework)
		 * 
		 */
		
		// Math 
		// PI, E
		// random()
		System.out.println(Math.random());
		
		// max/min()
		System.out.println(Math.max(10.3, 20));
		
		// "10.3" vs "20.6" -> max?
		System.out.println(Math.max(Double.parseDouble("10.3"), Double.parseDouble("20.6")));
		
		
	}

}
