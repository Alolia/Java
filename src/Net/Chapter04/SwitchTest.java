package Net.Chapter04;

import java.io.IOException;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args)  throws IOException{
		Scanner scanner =new Scanner(System.in);
		int a =scanner.nextInt();
		
		if (a>100){
			System.out.println("满分100，你能考"+a+"分？");
		}
			
		switch(a/10){
		case 6:
			System.out.println("及格");
		break;
		
		case 7:
			System.out.println("一般");
		break;
		
		case 8:
			System.out.println("良好");
		break;
		
		case 9:
			System.out.println("优秀");
		break;
		
		case 10:
			System.out.println("满分");
		break;
		
		default:
			System.out.println("不及格");
		break;
		}
		scanner.close();
	}

}
