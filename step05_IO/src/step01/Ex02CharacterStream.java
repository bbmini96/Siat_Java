package step01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02CharacterStream {
	// fileSave: FileWriter
	public static void fileSave() throws IOException {
		// FileWriter 사용시 true를 파라미터로 전달하면 이어쓰기가 된다
		FileWriter fw = new FileWriter("CharacterStream.txt", true);

		char[] city = { '로', '마' };
		fw.write(city);
		//
		fw.write("오사카");

		fw.flush(); // stream 내부에 데이터가 남아있지 않도록 한번에 전달

		fw.close();

	}

	// fileOpen: fileReader
	public static void fileOpen() throws IOException {
		FileReader fr = new FileReader("CharacterStream.txt");
		int data;
		while ((data = fr.read()) != -1) {
			System.out.println((char) data);
		}
	}

	public static void main(String[] args) {
		try {
//			fileSave();
			fileOpen();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
