package Net.Chapter08;

public class Equal {

	public static void main(String[] args) {
		Integer i=10000;
		Integer j=10000;
	/*	
		Integer i=127;
		Integer j=127;
	*/	
		
		if (i.equals(j)){
			System.out.println("i equals j");
		}
		
		if (i == j){
			System.out.print("i == j"); //i、j<=127则可以打印
		}
	}

}

