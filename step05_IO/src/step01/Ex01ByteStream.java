package step01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01ByteStream {
	// fileSave: OutputStream
	public static void fileSave() throws IOException {
		// txt파일을 생성하시오
		FileOutputStream fos = new FileOutputStream("ByteStream.txt");

		// 바이트타입으로 반환하기 때문에 a가 출력된다
		fos.write(97);

		// 여러개의 byte 데이터 전달
		byte[] data = { 65, 66, 67, 68, 69 };
		fos.write(data);

		// 자원 반환
		fos.close();
	}

	// file open: InputStream
	public static void fileOpen() throws IOException {
		// 1.
		FileInputStream fis = new FileInputStream("ByteStream.txt");

		// 모든 데이터를 출력하려면?
		// v1
//		int data;
//		while ((data = fis.read()) != -1) {
//			System.out.println(data);
//		}

		// v2: File 클래스 사용
		File file = new File("ByteStream.txt");
		byte[] readDate = new byte[(int) file.length()];
		fis.read(readDate);
		for (byte data : readDate) {
			System.out.println(data);
		}

		// 2. 자원 반환
		fis.close();
	}

	public static void main(String[] args) {
		try {
			// output
//			fileSave();

			// input
			fileOpen();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
