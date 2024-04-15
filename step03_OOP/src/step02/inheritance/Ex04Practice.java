package step02.inheritance;

class Customer extends Object {
	String id;
	String grade;
	
	public Customer(String id, String grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", grade=" + grade + "]";
//	}
	
	@Override
    public boolean equals(Object obj) {
		
		// obj.getId() .equals() this.getId()
		// ? instanceof
		if(obj instanceof Customer) {
			Customer customer = (Customer)obj;
			if(this.getId().equals(customer.getId())) {
				return true;
			}
		}
		
        return false;
    }
	
}

class Customer2 {
	String id;
	String grade;
	
	public Customer2(String id, String grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
//	@Override
//	public String toString() {
//		return "Customer2 [id=" + id + ", grade=" + grade + "]";
//	}
}

public class Ex04Practice {

	public static void main(String[] args) {
		
		// 
		Customer c1 = new Customer("1001", "Java");
		Customer c2 = new Customer("1001", "Java");
		Customer2 c3 = new Customer2("1001", "Java");
		
		
		// 3) 같은 타입 -> 같은 id 사용하고 있다면 같은 객체로 인식하려면?
		
		// 1) c1 - c2 같은 객체 인가요? false -> true
//		System.out.println(c1); // @49e4cb85
//		System.out.println(c2); // @2133c8f8
		System.out.println(c1.equals(c2)); // false -> true
		
		// 2) c1 - c3 같은 객체 인가요? false
//		System.out.println(c1); // @49e4cb85
//		System.out.println(c3); // @2133c8f8
		System.out.println(c1.equals(c3)); // false
		
	}

}
