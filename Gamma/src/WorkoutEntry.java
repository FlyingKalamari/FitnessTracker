import java.util.HashMap;
import java.util.Date;
import java.util.ArrayList;
public class WorkoutEntry implements java.io.Serializable
{
	private ArrayList<PerformedSet> pSetList;
	private HashMap<PerformedSet, Boolean> vSetMap = new HashMap<PerformedSet, Boolean>();
	private Date date;

	
	public WorkoutEntry(Date date)
	{
		this.setDate(date);
	}
	public WorkoutEntry(Date date, ArrayList<PerformedSet>pSetList)
	{
		this(date);
		this.pSetList = new ArrayList<PerformedSet>(pSetList);
		for(PerformedSet s : pSetList)
		{
			// true by default
			vSetMap.put(s, true);
		}
	}

	public void setSuccessfullyPerformed(boolean status, PerformedSet set)
	{
		if(set == null)
		{
			//throw exception
		}
		
		vSetMap.put(set, status);
	}
	
	public boolean isSetSuccessful(PerformedSet set)
	{
		return vSetMap.get(set);
	}
	
	public boolean allWorkoutsDone()
	{
		for(boolean flag : vSetMap.values())
		{
			if (flag == false)
				return false;
		}
		return true;
	}
	
	public void addSet(PerformedSet set)
	{
		if(set == null)
		{
				//throw null pointer exception
		}
		pSetList.add(set);
	}

	public void deleteSet(PerformedSet set)
	{
		pSetList.remove(set);
	}
	
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString()
	{	
		String info = "" + date;
		for(PerformedSet s : pSetList)
		{
			info+=  "\n" + s.toString();
		}
		
		return info;
	}
	/*
	@Override
	public int hashCode()
	{
			// TODO: add a hashfunction that evenly distributes keys
	}
	*/
}