import java.util.Calendar;
import java.util.TimerTask;
import java.util.Date;

public class Scheduler extends TimerTask
{
	Date now;
	Calendar someDate;
	
	public void run()
	{
		now = new Date();
		System.out.println("Current Time: " + now);
		
	}
	
}