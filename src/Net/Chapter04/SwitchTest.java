package Net.Chapter04;

import java.io.IOException;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args)  throws IOException{
		Scanner scanner =new Scanner(System.in);
		int a =scanner.nextInt();
		
		if (a>100){
			System.out.println("����100�����ܿ�"+a+"�֣�");
		}
			
		switch(a/10){
		case 6:
			System.out.println("����");
		break;
		
		case 7:
			System.out.println("һ��");
		break;
		
		case 8:
			System.out.println("����");
		break;
		
		case 9:
			System.out.println("����");
		break;
		
		case 10:
			System.out.println("����");
		break;
		
		default:
			System.out.println("������");
		break;
		}
		scanner.close();
	}

}
