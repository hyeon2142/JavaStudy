package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("image.png");
			os = new FileOutputStream("image_copy.png");
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			// is.read();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		}
		
		finally {
			try {
				if(is != null) {
				is.close();
				}
				
				if(os != null) {
					os.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
