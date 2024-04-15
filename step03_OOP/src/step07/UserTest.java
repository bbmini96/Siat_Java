package step07;

import model.User;

public class UserTest {

	public static void main(String[] args) {
		// User 객체 생성
		User user1 = new User("1001", "1@gmail.com");
		
		// 빌더 패턴 User 객체 생성
//		User user2 = new User.Builder()
//								.id("1002")
//								.email("2@gmail.com")
//								.build();
		User user2 = User.builder()
							.id("1002")
							.email("2@gmail.com")
							.build();
				
		User user3 = new User("1003", null);
				
//		User user4 = new User.Builder()
//								.id("1004")
//								.build();		
				
		User user5 = new User("1005", null, null, null, null);
		
		User user6 = new User();
	}

}