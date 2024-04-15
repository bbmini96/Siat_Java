package step02.object;

class Employee {
	// 인스턴스 변수
	String name;
	// static 변수
	static String company = "IT";
	
	// final을 붙이면 상수를 변경 할 수 없다 
	// static final: 타입 CONSTANT_VALUE
	static final double PI = 3.14;		
	
	Employee(String name){
		this.name = name;
	}
	// getName
	String getName() {
		return name;
	}
	// 객체의 소속이라 static을 해줘야 값을 가져 올 수 있다
	static String getCompany() {
		return company;
	}
	
	
}

public class Ex03Static {

	public static void main(String[] args) {
		Employee emp1 = new Employee("emp1");
//		System.out.println(emp1.name);
//		System.out.println(emp1.company);	// 객체를 통해 가져오지않는다
//		System.out.println(Employee.company);	// 클래스를 통해 가져와야한다
		
		System.out.println(emp1.getName());
		System.out.println(Employee.getCompany());
		
		
		
		
	}

}
