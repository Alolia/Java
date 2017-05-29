package Net.Chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamTest {

	public static void main(String[] args) throws Exception{
		File f = new File("E:/Alolia/test/asa");
		FileOutputStream out = new FileOutputStream(f);
		String content = "siudghgsbfug";
		out.write(content.getBytes());
		out.flush();
		out.close();
		
		FileInputStream in = new FileInputStream(f);
		byte[] _content = new byte[in.available()];
		in.read(_content);
		
		String readContent = new String(_content);
		
		System.out.print(readContent);
		in.close();
		
	}

}
