package corejavapart3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("today's Date---->"+date);
	      String timeFormatString = "hh:mm:ss a";
	      DateFormat timeFormat = new SimpleDateFormat(timeFormatString);
	      String currentTime = timeFormat.format(date);
	      System.out.println("Current time: "+currentTime);
	      String dateFormatString = "EEE, MMM d, ''yy";
	      DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
	      String currentDate = dateFormat.format(date);
	      System.out.println("Current date: "+currentDate);

	}

}
