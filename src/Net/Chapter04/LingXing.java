package Net.Chapter04;
import java.util.Scanner;
public class LingXing {

		public static void main(String args[] ) {
			System.out.println("请输入菱形的边长");
			Scanner input =new Scanner(System.in);
			int no =input.nextInt();
			int width = no;
			
			int start = 0;
			int end = 0;
			char space=' ';
			char point ='*';
			
			for(int i=0;i<width;i++){
				start = width-1 -i;
				end = start + i*2;
				for(int j=0;j<=end;j++){
					if(j==start){
						System.out.print(point);
						
					}else if(j==end){
						System.out.print(point);
					}else{
						System.out.print(space);
					}
					
				}
				System.out.print("\n");
			}
			
			
			for(int i=width-2;i>-1;i--){
				start = width-i-1;
				end = start + i*2;
				for(int j=0;j<=end;j++){
					if(j==start){
						System.out.print(point);
						
					}else if(j==end){
						System.out.print(point);
					}else{
						System.out.print(space);
					}
					
				}
				System.out.print("\n");
			}

		}
	}