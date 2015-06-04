import java.util.ArrayList;
import java.util.Date;
public class WorkoutRoutine
{	
	private String name;
	private Date dateCreated;
	private ArrayList<Excercise> fitnessExcercises;
	
	public WorkoutRoutine(String name, Date dateCreated, ArrayList<Excercise> fitnessExcercises)
	{
		this.setDateCreated(dateCreated); 
		this.name = name;
		this.fitnessExcercises = new ArrayList<Excercise>(fitnessExcercises);
	}
	// intended privacy leak here
	public ArrayList<Excercise> getFitnessExcercises() {
		return fitnessExcercises;
	}
	public String getName() {
		return name;
	}
	
	public void addExcerciseToRoutine(Excercise e)
	{
		fitnessExcercises.add(e);
	}
	
	public Excercise removeExcercise(Excercise e)
	{
		int eIndex = fitnessExcercises.indexOf(e);
		if(eIndex != -1)
			return fitnessExcercises.remove(eIndex);
		return null;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
