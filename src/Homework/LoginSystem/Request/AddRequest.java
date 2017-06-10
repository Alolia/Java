package Homework.LoginSystem.Request;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.UUID;

import Homework.LoginSystem.Login;
import Homework.LoginSystem.Student;
import Homework.LoginSystem.define.Request;

public class AddRequest implements Request{
	private Student fill;
	public Student getFill(){
		return fill;
	}

	public static void main(String[] args) {
		
	}

	@Override
	public boolean input() {
		fill = new Student();
		String [] fields = new String[]{
			"姓名",
			"性别",
			"出生日期",
			"身高",
			"体重"
		};
		String [] reflectFields = {
			"name",	
			"sex",
			"birthday",
			"heigth",
			"weigth",
		};
		
		for(int i=0;i<fields.length;i++){
			System.out.print("请输入"+fields[i]+":");
			String value = Login.input.nextLine();
			try{
				Field field = Student.class.getDeclaredField(reflectFields[i]);
				field.setAccessible(true);
				if("birthday".equals(reflectFields[i])){
					try{
						field.set(fill, Student.df.parse(value));
					}catch (ParseException e){
						e.printStackTrace();
					}
					}else{
						field.set(fill, value);
					}
					field.setAccessible(false);
			}catch(IllegalArgumentException e){
				e.printStackTrace();
			}catch(IllegalAccessException e){
				e.printStackTrace();
			}catch(NoSuchFieldException e){
				e.printStackTrace();
			}catch(SecurityException e){
				e.printStackTrace();
			}
		}
		fill.setId(UUID.randomUUID().toString());
		return true;
	}


}
