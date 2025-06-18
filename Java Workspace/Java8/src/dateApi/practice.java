package dateApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class practice {
	public static void main(String args[]) {
		LocalDate d = LocalDate.now();
		LocalDate d1 = LocalDate.of(2000, Month.DECEMBER, 20);
		System.out.println(d1);
		System.out.println(d);
		
		LocalTime t = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(t.getHour());
	}
}
