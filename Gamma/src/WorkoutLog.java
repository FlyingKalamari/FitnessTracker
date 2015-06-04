import java.util.ArrayList;

public class WorkoutLog
{
	private ArrayList<WorkoutEntry> wList; 
	
	
	public WorkoutLog(ArrayList<WorkoutEntry> w)
	{
		this.wList = new ArrayList<WorkoutEntry>(w);
	}
	
	public void addEntry(WorkoutEntry e)
	{
		if(e!= null)
			wList.add(e);
	}
	
	public WorkoutEntry removeEntry(WorkoutEntry e)
	{
		int elemIndex = wList.indexOf(e);
		if(elemIndex > 0)
		{
			return wList.remove(elemIndex);
		}
		
		else
		{
			System.out.println("Entry does not exist!");
		}
		return null;
	}
}