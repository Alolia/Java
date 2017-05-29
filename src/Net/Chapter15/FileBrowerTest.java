package Net.Chapter15;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileBrowerTest {

	public static void main(String[] args) {
		File f = new File("E:/Alolia");
			if(f.isDirectory()){
				File[] children = f.listFiles(new FileFilter(){

					@Override
					public boolean accept(File pathname) {
						System.out.println(pathname.getName());
						return pathname.getName().endsWith(".txt");
					}});
				System.out.println("Result as below");
				for (int i=0;i<children.length;i++){
					File child = children[i];
					System.out.println(child.getAbsolutePath());
			}	
		}
	}
}