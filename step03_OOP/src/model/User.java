package model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // 기본 생성자
@Getter // getter 
@Setter // setter
@ToString // toString 오버라이딩

//@Builder
public class User {
	private String id;
	private String email;
	private String password;
	private String name;
	private Integer age;
	// ...
	
	public User(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	@Builder
	public User(String id, String email, String password, String name, Integer age) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	/*
	 * Builder 빌더 패턴 : 생성자 패턴중 하나
	 * -> 내부 클래스 Builder => 최종적으로 필요한 필드를 갖고 있는 User 객체를 만들기 위한 내부 클래스
	 */
//	static public class Builder {
//		private String id;
//		private String email;
//		
//		public Builder() {}
//		public Builder(User user) {
//			this.id = user.id;
//			this.email = user.email;
//		}
//		
//		// setXXX -> 필드명으로 메소드를 생성
//		public Builder id(String id) {
//			this.id = id;
//			return this;
//		}
//		public Builder email(String email) {
//			this.email = email;
//			return this;
//		}
//		
//		// User 객체 리턴하기위한 메소드
//		public User build() {
//			return new User(id, email);
//		}
//	}
	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getAge() {
//		return age;
//	}
//	public void setAge(Integer age) {
//		this.age = age;
//	}
	
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", email=" + email + "]";
//	}
	
}