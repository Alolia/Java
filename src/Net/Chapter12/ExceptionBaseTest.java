package Net.Chapter12;



public class ExceptionBaseTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 1;
		try{
			j = i/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println(j);
	}

}
