package logic;

import java.time.LocalDate;

public class DateManager {

	public LocalDate oldestDate (LocalDate[] dates) {
		LocalDate min = LocalDate.MAX;

		for(int i = 0; i < dates.length; i++) {
			if(dates[i].isBefore(min)) min = dates[i];
		}
		
		return min;
	}
	
	public LocalDate mostRecentDate (LocalDate[] dates) {
		LocalDate max = LocalDate.MIN;

		for(int i = 0; i < dates.length; i++) {
			if (dates[i].isAfter(max)) max = dates[i];
		}
		
		return max;
	}
	
	public LocalDate addOneMonth (LocalDate date) {
		return date.plusMonths(1);
	}
	
}
