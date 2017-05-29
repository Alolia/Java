package Net.Chapter15;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
	//	System.out.println("\n");
	//	System.out.println("\t");
		File f = new File("E:/Java/test");
		
		if(f.exists()){
			if(f.isDirectory()){
			System.out.println("is folder");
		}else{
			System.out.println("is file");
		}
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
	}else{
		System.out.println("ashdfahofhoahdf");
		boolean created = f.mkdir();
		System.out.println("file is created?"+ created);
	}
}
}
