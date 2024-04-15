package step02.object;
/*
 * 접근 제어자 Access Modifier 
 *	- private 동일 클래스< default 동일 패키지< protected 동일 클래스,패키지< public
 *  - 클래스(default, public만 사용가능), 변수, 메소드, 생성자
 */

import model.People;

public class Ex04Access {

	public static void main(String[] args) {
		
		People java = new People("java", 28);
		System.out.println(java.getName() + java.getAge());
	

	}

}
