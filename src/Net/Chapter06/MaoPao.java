package Net.Chapter06;

public class MaoPao {
	public static void main(String[] args) {
	int arr[]=new int[]{654,2,558,52,48,62,86,5,9656,878,487,98,458,8};
	MaoPao sorter =new MaoPao();
	sorter.sort(arr);}
	public void sort(int[] arr) {
		for (int i=1;i<arr.length;i++){
			for (int j=0;j<arr.length-i;j++){
				if (arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
	}
			}
		}
		showArray(arr);
	}
	public static void showArray(int[] arr) {
		for (int i:arr){
			System.out.print(" < "+i);
		}
		
	}
}

