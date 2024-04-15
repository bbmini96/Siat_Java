package step02.object;
/*
 * People
 * - 속성: name, age
 * - 기능: getXXX, / printInfo
 * 
 * */
class People {
	// 클래스 구조
	// 인스턴스 변수 = 필드, 객체변수라고도 한다
	String name = "java";
	int age = 28;

	
	// 생성자: 객체 생성 필수 요소, 객체 초기화
	// 생성자의 이름을 가지고 만들어야 한다
	People() {}		// 기본 생성자
	
	// 메서드
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	
	void printInfo(){
		System.out.println(name + " " + age);
	}
}


public class Ex01People {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스명, 변수명 = new 클래스명()
		People ppl1 = new People();
		System.out.println(ppl1.getAge());
		System.out.println(ppl1.getName());
		ppl1.printInfo();
		
		

	}

}
