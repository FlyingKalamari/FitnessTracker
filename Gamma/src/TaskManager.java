import java.util.Timer;
import java.util.Date;

public class TaskManager
{

	public static void main(String args[]) throws InterruptedException{
		Timer time = new Timer();
		Scheduler st = new Scheduler();
		time.schedule(st, 0, 25000);  // Create same task every 5 secs
		
		for(int i = 0; i <=8; i++)
		{
			Thread.sleep(5000);
			if(i == 8)
			{
				System.out.println("Execution Ended");
				System.exit(0);
			}
		}
		
		
		
		
	}
}