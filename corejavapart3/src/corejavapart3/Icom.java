package corejavapart3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Icom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
	      System.out.println("Current date: "+date);
	      //Getting the current time value
	      LocalTime time = LocalTime.now();
	      System.out.println("Current time: "+time);
	      //Getting the current date-time value
	      LocalDateTime dateTime = LocalDateTime.now();
	      System.out.println("Current date-time: "+dateTime);

	}

}
