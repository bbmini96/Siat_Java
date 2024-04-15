package step02.object;

class People2 {
	// 클래스 구조
	// 인스턴스 변수 = 필드, 객체변수라고도 한다
	String name = "java";
	int age = 28;
	
	// 생성자: 객체 생성 필수 요소, 객체 초기화
	// 생성자의 이름을 가지고 만들어야 한다
	People2() {}		// 기본 생성자
	
	// 사용자 정의 생성자
	// 생성자 오버로딩
	People2(String name){
		this.name = name;
	}
	People2(String name, int age){
		this.name = name;
		
		if (age >= 0) {
			this.age = age;	
		}
		
	}
	
	// 메서드
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	// void setAge(int age)
	void setAge(int age) {
		if (age >= 0 ) {
			System.out.println(this.age = age);
			
		}else {
			System.out.println("음수값으로는 나이 지정 불가능");
		}
	}
	
	void printInfo(){
		System.out.println(name + " " + age);
	}
}

class A {
	A() {
		System.out.println("Class A");
	}
}

class B {
	B() {
		System.out.println("Class B");
	}
	A a = new A();
}


class People3{
	String name;
	
	People3(){};
	People3(String name) {
		this.name = name;
	}
}

public class Ex02People {

	public static void main(String[] args) {
		
		People2 sw = new People2("sw");
		People2 hj = new People2("hj", 26);
		
//		System.out.println("이름: " + sw.getName() +", 나이: "+ sw.getAge());
//		System.out.println("이름: "+hj.getName() +", 나이: "+ hj.getAge());
		
		// 객체 보호
		// 1. 생성자를 통해 보호
		People2 cm = new People2("cm", 27);
		// 2. 메서드를 통해 보호
		cm.setAge(20);
		// 3. 접근 제어자 private
		
		// 기본 생성자 vs 사용자 정의 생성자
		People2 java = new People2();
		
		// 기본 생성자: 클래스 내부에서 생략되어도 프로그램이 자동으로 생성
		// 사용자 정의 생성자: 클래스 내부에서 생략되어도 프로그램이 자동으로 생성(사용자 정의 생성자가 없을 때만!!)
		People3 ppl3 = new People3();
		System.out.println(ppl3);
		
		A a = new A();
		B b = new B();
		
	

	}

}
