package Net.Chapter07;

public class NewStatic {
	public static int count =0;
	public NewStatic(){
		System.out.println("1212");
		count++;
	}
	
	public static void main(String[] args) {
		NewStatic a =new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		a=new NewStatic();
		
//		Child a=new Child();
		System.out.println(a);
	}

}
/*
class Child{
	
}
*/
