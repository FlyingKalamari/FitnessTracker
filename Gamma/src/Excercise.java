import java.util.Date;
public class Excercise
{
	private int id;
	private String name;
	private String difficulty;
	private Date dateCreated;
	
	public Excercise(int id, String name, String difficulty, Date dateCreated)
	{
		this.id = id;
		this.name = name;
		this.difficulty = difficulty;
		this.dateCreated = dateCreated;
	}
}