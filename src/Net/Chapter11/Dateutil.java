package Net.Chapter11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateutil {
		public static Date firstDateForMonth(Date value){
			if (value == null){
				return null;
			}
			Calendar c = Calendar.getInstance();
			c.setTime(value);		
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.HOUR_OF_DAY,0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.MILLISECOND,0);		
			return c.getTime();
		}
		public static void main(String[] args)throws Exception{
			DateFormat DF = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(Dateutil.firstDateForMonth(new Date()));
			System.out.println(Dateutil.firstDateForMonth(DF.parse("2017-05-14")));
			System.out.println(Dateutil.firstDateForMonth(DF.parse("2017 05 14")));
			System.out.println(Dateutil.firstDateForMonth(DF.parse("2017-05-141")));//¥ÌŒÛ∏Ò Ω
		} 
}
