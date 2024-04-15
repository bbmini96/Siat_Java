package step01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex06Properties {

	public static void main(String[] args) {
		// 환경 변수(properties)를 성정하는 파일 입출력

		/*
		 * DB - Java application 연동시, USER_ID, USER_PW 사용하려면?
		 * 
		 * => 파일명: db.properties => 내용: id, pw
		 * 
		 * -> 파일 -(읽기)> FileInputStream -> 변수 -> 소스코드 활용
		 */

		Properties properties = new Properties();
		String id;
		String pw;

		try {
			properties.load(new FileInputStream("db.properties"));
			id = properties.getProperty("USER_ID");
			pw = properties.getProperty("USER_PW");

			System.out.println(id);
			System.out.println(pw);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
