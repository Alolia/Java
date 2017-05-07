package Net.Chapter10;
class S{
	
}
public class OverWriteEquals {
	public static void main(String[] args){
		String a ="123";
		String b ="123";
		System.out.println(a.equals(b));
		S a1=new S();
		S b1=new S();
		System.out.print(a1.equals(b1));
	}
}
