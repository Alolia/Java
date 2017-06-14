package Net.Chapter17;

public class EnumTest {

	public static void main(String[] args) {
	//方法一	
		Admin admin = new Admin();
		admin.setName("喵喵喵");
		admin.setSex("男");
		
	//方法二
		admin.setSex(Admin.getSexMan());
		if(Admin.getSexMan().equals(admin.getSex()));
		
		
	}

}


class Admin{
	
	private static final String SEX_MAN = "M";
	private static final String SEX_FEMALE = "F";
	
	private String id;
	private String name;
	private String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public static String getSexMan() {
		return SEX_MAN;
	}
	public static String getSexFemale() {
		return SEX_FEMALE;
	}
}