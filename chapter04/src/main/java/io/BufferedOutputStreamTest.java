package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		BufferedOutputStream bos = null;

		try {

			// 기반 스트림
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 보조 스트림
			bos = new BufferedOutputStream(fos);

			for (int i = 'a'; i < 'z'; i++) {
				bos.write(i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Cant open:" + e);
		} catch (IOException e) {
			System.out.println("errore:" + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
