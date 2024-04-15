package step01;

import java.io.File;
import java.io.IOException;

public class Ex04File {

	public static void main(String[] args) {
		// File 객체
		File file = new File("fileTest.txt");
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());

		// C드라이브 > java 폴더 생성
		String path = "C:\\java";
		File javaDirectory = new File(path);

		// dir
//		javaDirectory.mkdir();	// 디렉토리 생성

		// javatext.txt 파일 생성 하려면?
		File javaText = new File(path, "java.txt");
		// file
		try {
			javaText.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
