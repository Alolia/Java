package Net.Chapter06;

import java.util.Arrays;

public class Compare {

	public static void main(String[] args) {
		int arr[]=new int[]{12,65,652,32,56,236,5566,};
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" < ");
		}
		
	}

}
