package localDate;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		int year = 2020;
		int month = 11;
		int dayOfMonth = 15;
		
		LocalDate ldate = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println(ldate.getDayOfWeek());
		System.out.println(ldate.getMonth());
		System.out.println(ldate.getYear());
	}

}
