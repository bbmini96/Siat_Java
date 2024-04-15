package model;

public class People {
	// 캡슐화: 객체 필드 보호
	private String name;
	private int age;

	People() {}		// 기본 생성자
	public People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 메서드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void printInfo(){
		System.out.println(name + " " + age);
	}
}
