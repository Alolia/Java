package Net.Chapter07;

import java.util.Date;
import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		String name = "haha";
		int age = 18;
		new Date();
		System.out.println("name :" + name);
		System.out.println("age  :" + age);
		
		String[] studentName = new String[100];
		int[] studentAge = new int[100];
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(scanner.hasNext()){
			System.out.println("enter name :");
			studentName[i] = scanner.next();
			System.out.print("enter age  :");
			studentAge[i] = scanner.nextInt();	

		Teacher tt = new Teacher();
		tt.work();
		
		Student ss = new Student();
		ss.study();
		
	}

}
	}



abstract class  Person{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}

class Teacher extends Person{
	
	void work(){
		
	}
	
}


class Student extends Person {
	
	String no;
	void study(){
		
	}
}



