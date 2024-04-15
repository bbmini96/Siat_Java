package step02.inheritance;

/* 
 * 상속 해주는 클래스 : Parent, Super
 * 상속 받는 클래스 : Child, Sub
 * 
 */

class Parent1 {
	protected String name;
	protected String age;

	public Parent1() {
		super();
//		System.out.println("Parent1 생성자");
	}

	public Parent1(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Parent2 {
	String option;
}

class Child1 extends Parent1 {
	String wish;

	public Child1() {
//		super();
	}

	public Child1(String name, String age, String wish) {
//		super();
		super.name = name;
		super.age = age;
//		super(name, age);
		this.wish = wish;
	}

	public String getWish() {
		return wish;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public void printInfo2() {
//		System.out.println(super.name);
//		System.out.println(super.age);
		super.printInfo();
		System.out.println(wish);
	}
}

class Animal {
	public void bark() {
		System.out.println("동물 bark");
	}
}

class Tiger extends Animal {

	@Override
	public void bark() {
		System.out.println("Tiger bark");
	}
}

class Lion extends Animal {

	@Override
	public void bark() {
		System.out.println("Lion bark");
	}
}

public class Ex01Child {

//	static void barkTiger(Tiger tiger) {
//		tiger.bark();
//	}
//	static void barkLion(Lion lion) {
//		lion.bark();
//	}

	static void barkAnimal(Animal animal) {
		animal.bark();
	}

	public static void main(String[] args) {

		// *** 부모의 변수, 메소드
		Child1 child = new Child1();
		child.setName("java");
		child.setAge("28");
		child.setWish("game");

//		child.printInfo();
//		child.printInfo2();

		// 1) printInfo2() -> wish + name, age 모두 출력?
		// hint : super키워드 사용 -> printInfo2메소드 추가 정의
//		child.printInfo2();

		// 2) 자식의 객체 생성시, name, age, wish 초기값을 갖는 자식 객체 생성하려면?
		Child1 child1 = new Child1("oop", "25", "study");
		child1.printInfo2();

		// 3) 부모에서 private 상속 불가능 -> protected 접근제어자 활용

		// 4) *** 자바는 단일 상속!!!

		// 5) *** 오버라이딩 Overriding
		/*
		 * 1) 메소드 명 2) 메소드 리턴 3) 메소드 상속
		 * 
		 */

		// 다형성 : 자식이 부모의 타입으로 객체 생성(단, 상속)
		Parent1 p1 = new Parent1();
		// 부모객체가 부모타입 생성

		Child1 c1 = new Child1();
		// 자식객체가 자식타입 생성

		Parent1 c2 = new Child1();
		// 자식객체가 부모타입 생성 : auto casting

		/*
		 * Child1 c3 = new Child1(); Parent1 c2 = c3;
		 * 
		 */

		// c2 사용할 수 있는 변수, 메소드는 무엇?
//		c2.printInfo2(); // 사용X
//		c2.wish(); // 사용X
		// => c2 부모타입의 변수, 메소드만 사용 가능(이유: 부모타입으로 생성되었기 때문)

		// 그렇다면, 원래 자식타입의 변수, 메소드를 다시 사용하려면?
		// => 부모타입 -> 자식타입으로 변경(Casting)
		Child1 c4 = (Child1) c2; // 명시적 형변환

//		c4.printInfo2(); // 사용O
//		c4.wish // 사용O

		Tiger tiger = new Tiger();
		barkAnimal(tiger); // tiger -> animal => (예상) 동물 bark, (결과) Tiger bark

		Lion lion = new Lion();
		barkAnimal(lion);

	}

}
