package logic;

import java.time.LocalDate;

public class DateManager {

	public LocalDate oldestDate (LocalDate[] dates, boolean ascOrdered) {
		LocalDate min = LocalDate.MAX;

		if(ascOrdered) return dates[0];
		
		for(int i = 0; i < dates.length; i++) {
			if(dates[i].isBefore(min)) min = dates[i];
		}
		
		return min;
	}
	
	public LocalDate mostRecentDate (LocalDate[] dates, boolean ascOrdered) {
		LocalDate max = LocalDate.MIN;

		if(ascOrdered) return dates[dates.length - 1];
		
		for(int i = 0; i < dates.length; i++) {
			if (dates[i].isAfter(max)) max = dates[i];
		}
		
		return max;
	}
	
	public LocalDate addOneMonth (LocalDate date) {
		return date.plusMonths(1);
	}
	
}
