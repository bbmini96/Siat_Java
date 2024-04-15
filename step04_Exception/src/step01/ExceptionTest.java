package step01;

import java.util.Scanner;

import exception.NotPasswordException;
import exception.NotUserException;

public class ExceptionTest {

	static String[] users = { "dev", "it", "java" };
	static String pas = "hello";

	public static void userLogin(String id) throws NotUserException {
		// 1) users.equals(id)
		// 2) true -> "로그인 성공"
		// 3) false -> throw new Exception
		for (String user : users) {
			if (user.equals(id)) {
				System.out.println("로그인 성공");
				return;
			} else {
				throw new NotUserException("Not User Exception");
			}
		}

	}

	public static void userPassword(String pass) throws NotPasswordException {
		if (pass.equals(pas)) {
			System.out.println("패스워드 일치");
			return;
		} else {
			throw new NotPasswordException("Not Password Exception");
		}

	}

	public static void main(String[] args) {
		/*
		 * 시스템 DB 저장되지 않은 사용자가 로그인할시, NotUserException 예외 발생 시키려면?
		 * 
		 */
		String id = "DEV";

		try {
			userLogin(id);
		} catch (NotUserException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * 예외 만들기?? 패스워드가 일치 하지 않으면 NotPasswordException 예외 발생
		 */

		String pass = "hellow";
		try {
			userPassword(pass);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
