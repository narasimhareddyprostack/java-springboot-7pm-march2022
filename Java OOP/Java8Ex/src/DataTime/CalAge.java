package DataTime;

import java.time.LocalDate;
import java.time.Period;

public class CalAge {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1983, 7, 11);
		
		LocalDate today= LocalDate.now();
		Period p= Period.between(dob, today);
		System.out.println("No of Years:" +p.getYears());
		System.out.printf("My Age is : %d Years %d Months and %d days", p.getYears(), p.getMonths(), p.getDays());

	}

}

//Period class  - used to calcualte represent - quantity of time