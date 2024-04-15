package step02.inheritance;

public class Ex02Practice {
	
	static Object printStudyList() {
		return "HTML,CSS,JavaScript,Python,Java,DB";
	}
	
	public static void main(String[] args) {
		
		// Q) Java 출력하려면?
		// *** 상속, 다형성 : Casting
		String result = (String)printStudyList();
		// substring, split, Stream, ...
		System.out.println(result.split(",")[4]);
		
	}

}
