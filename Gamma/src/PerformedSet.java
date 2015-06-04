public class PerformedSet
{
	private double weight;
	private int repititions;
	private boolean toFailure = false;
	private int numOfSets;
	
	public PerformedSet()
	{
		weight = repititions = numOfSets = 0;
	}
	
	public PerformedSet(int repititions, int numOfSets, double weight, boolean toFailure)
	{
		this(repititions, numOfSets);
		this.weight = weight;
		this.toFailure = toFailure;
		
	}
	
	public PerformedSet(int repititions, int numOfSets, boolean toFailure)
	{
		this(repititions, numOfSets);
		this.toFailure = toFailure;
	}
	
	public PerformedSet(int repititions, int numOfSets)
	{
		this.repititions = repititions;
		this.numOfSets = numOfSets;
	}
	
	@Override
	public String toString()
	{
		String info = "W: "+ weight + " R: " + repititions + "N: "+ numOfSets + " ";
		return info;
	}
	
}