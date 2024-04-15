package step01;

import java.util.Scanner;

public class Ex05Scanner {

	public static void main(String[] args) {
		// 콘솔 입력Input
		System.out.println("스캐너 실행 ==>");
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int num = sc.nextInt();

		// 콘솔 출력Output
		System.out.println("문자열: " + str);
		System.out.println("숫자: " + num);

		System.err.println("test");

		// 1) Exception 주의
		// 2) Scanner close() 자원 반환 필수!
		sc.close();
	}

}
