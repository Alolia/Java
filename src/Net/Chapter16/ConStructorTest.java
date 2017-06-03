package Net.Chapter16;

import java.lang.reflect.Constructor;
import java.util.Date;

public class ConStructorTest {

	public static void main(String[] args) {
		Constructor<?>[] constructors = User.class.getConstructors();
		
		for(int i=0;i<constructors.length;i++){
			Constructor<?> constructor = constructors[i];
			if(constructor.getParameterTypes()==null &&
					constructor.getParameterTypes().length==0){
				System.out.println("木有构造函数");
			}else{
				System.out.println("有"+constructor.getParameterCount()+"个构造函数");
			}
		}
	}

}


class User implements java.io.Serializable{
	private String id;
	private String name;
	private Date birthday;
	
	public User(){
		
	}
	
	public User(String name){
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(1024);
		sb.append(getClass().getName()).append("[\n")
			.append("id=").append(getId()).append("\n")
			.append("name=").append(getName()).append("\n")
			.append("birthday=").append(getBirthday()).append("\n").append("\n]");
		return sb.toString();
	}
	
	
}