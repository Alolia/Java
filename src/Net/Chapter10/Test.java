package Net.Chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		DateFormat dt = new SimpleDateFormat("yy-mm-dd");
		person p = new person();
		p.setid("123123");
		p.setname("xxx");
		p.setBirthday(dt.parse("12-46-56"));
		System.out.println(p);

		teacher t = new teacher();
		t.setid("123123");
		t.setname("xxx");
		t.setBirthday(dt.parse("12-56-89"));
		t.setworkyear(5);
		System.out.println(t);

		/**
		 * Long current = System.currentTimeMillis();
		 * System.out.println(current);
		 * 
		 * Date date = new Date(current); System.out.println(date);
		 * 
		 * person p =new person(); p.id ="123123"; System.out.println(p);
		 * teacher t =new teacher(); t.id ="321321"; System.out.println(t);
		 * 
		 * }
		 ***/
	}

}

class person {
	private String name;
	public String id;
	private Date birthday;

	public person() {
		// System.out.println("newperson called ");
		// this.name ="Name1";
		// this.birthday=new Date();
	}

	public String getid() {
		return this.id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Date getbirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	public String toString(){
		StringBuilder sb =new StringBuilder(1024);
		sb.append(getClass().getName()).append(":dd=").append(getid()).
			append(" nn=").append(getname()).
			append(" bb=").append(getbirthday());
		return sb.toString();

	}
}

class teacher extends person {
	private int workyear;
	public int getworkyear(){
		return this.workyear;
	}
	public void setworkyear(int workyear){
		this.workyear =workyear;
	}
	public teacher() {
		System.out.println("ÀÏŽŸ½Ðßã£¿");
	}
	public String toString(){
		StringBuilder sb =new StringBuilder(1024);
		sb.append(super.toString()).append(",workYear=").append(getworkyear());
//		sb.append("dd=").append(getid()).
//		append(" nn=").append(getname()).
//		append(" bb=").append(getbirthday()).
//		append(" wy=").append(getworkyear());
	return sb.toString();
	}

}
