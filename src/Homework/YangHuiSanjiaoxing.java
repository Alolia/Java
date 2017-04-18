package Homework;

import java.util.Scanner;

public class YangHuiSanjiaoxing {

	public static void main(String[] args) {
		System.out.print("ÄãÒª¼¸¸öÑî»Ô£¿");
		Scanner input = new Scanner(System.in);
		int a =input.nextInt();
		  int arr[][]=new int [a][];
		for (int i=0;i<arr.length;i++){
			arr[i]=new int [i+1];
		}
		for (int i=0;i<arr.length;i++){
			arr[i][0]=arr[i][i]=1;
			for (int j=0;j<arr.length;j++){
				if(i>1&&j>0&&i>j){
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
				
			}
		System.out.println();
		}
		
	 }
}


/*
 00
 010
 0110
 01210
 013310
 0146410
 
 [i][j]=[i-1][j-1]+[i-1][j]


*/

