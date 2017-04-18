package Net.Chapter07;

public class CompareObject {

	public static void main(String[] args) {
		String a =new String ("123");
		String b =new String ("123");
		String c =a;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.print(b==c);
	}

}

