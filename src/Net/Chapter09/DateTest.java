package Net.Chapter09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		Date date= new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		DateFormat df =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(df.format(new Date()));
		
	//	Date _date = df.parse ("格式与上述对应");
		Date _date = df.parse ("22/04/2017 16:30:12");
		System.out.println(df.format(_date));
	}

}
