package Date_Time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Date {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
//		Date d1 = sdf.parse("10-05-2004");
		System.out.println(d);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);

	}

}
