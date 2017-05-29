package Net.Chapter14;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Country china = new Country();
		china.setTitle("ROC");
		china.setName("China");
		china.setCode("CN");
		
		Country unionStatus = new Country();
		unionStatus.setTitle("Union Status");
		unionStatus.setName("America");
		unionStatus.setCode("US");
		
		Map g2 = new HashMap();
		g2.put(china.getCode(), china);
		g2.put(unionStatus.getCode(), unionStatus);

		
		System.out.println(g2.get("CN"));
		System.out.println(g2.get("US"));
		
		int [] arrary = new int [100];  //0-99
		System.out.println(china.hashCode());
		System.out.println(unionStatus.hashCode());
		
	}

}


class Country{
	private String title;
	private String name;
	private String code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
