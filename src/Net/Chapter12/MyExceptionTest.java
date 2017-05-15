package Net.Chapter12;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args)throws MyException {
		System.out.println("���䣺");
		Scanner scanner = null;
		try{
			scanner = new Scanner(System.in);
			while(scanner.hasNextInt()){
				int age = scanner.nextInt();
				if (age == -1){
					break;
				}
				if (age<1 || age >120){
					throw new MyException();
				}
			}
		}finally{
			scanner.close();
		}
	}

}

class MyException extends Exception{
	public MyException(){
		super("���������ڵ���0��С�ڵ���120");
	}
}

