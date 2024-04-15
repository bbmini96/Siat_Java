package step03.singleton;

public class LogTest {

	public static void main(String[] args) {
		
		// login시 성공 -> "로그인 성공"/ 실패 -> "로그인 실패"
		
		String password = "admin";
		String inputPassword = "it";
		
		Log log = Log.getInstance();
		System.out.println(log);
		
		if (inputPassword == password) {
			log.logSuccess();
		}else {
			log.logFail();
		}

	}

}
