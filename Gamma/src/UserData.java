import java.util.Calendar;
import java.util.Date;

public class UserData
{
	private int id; 
	private String name;
	private String height;
	private String weight;
	private String workoutRoutine;
	private Date birthDate; 
	private Date dateStarted;
	
	
	public UserData(String name, Date birthDate, String workoutRoutine, Date dateStarted)
	{
		this.name = name;
		this.birthDate = birthDate;
		this.workoutRoutine = workoutRoutine;
		this.dateStarted = dateStarted;
	}
	

}