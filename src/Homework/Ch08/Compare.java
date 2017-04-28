package Homework.Ch08;

public class Compare {

	public static void main(String[] args) {
		Character char1 = new Character('A');
		Character char2 = new Character('a');
		boolean a = char1.equals(char2);
		System.out.println(char1+"="+char2+"?:"+a);
		Character char3 = Character.toLowerCase(char1);
		Character char4 = Character.toLowerCase(char2);
		boolean b = char3.equals(char4);
		System.out.println(char3+"="+char4+"?:"+b);
	}

}
