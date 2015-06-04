import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import com.thoughtworks.xstream.XStream;
public class WorkoutEntryTest
{
	public static void main(String [] args) throws IOException
	{
		ArrayList<PerformedSet> sets = new ArrayList<PerformedSet>(10);
		for(int i = 0; i < 10; i++)
		{
			sets.add(new PerformedSet(i,i,i, false));
		}
		
		WorkoutEntry f = new WorkoutEntry(new Date(), sets);
		
		System.out.println(f);
		
		XStream xstream = new XStream();
		File file = new File("myFile");
		file.createNewFile();
		FileWriter w = new FileWriter(file);
		String xml = xstream.toXML(f);
		
		
		FileOutputStream fos = null;
		try {
		    fos = new FileOutputStream("someFile.xml");
		    fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8")); //write XML header, as XStream doesn't do that for us
		    byte[] bytes = xml.getBytes("UTF-8");
		    fos.write(bytes);
		    System.out.println("Success!");

		} catch(Exception e) {
		    e.printStackTrace(); // this obviously needs to be refined.
		} finally {
		    if(fos!=null) {
		        try{ 
		            fos.close();
		        } catch (IOException e) {
		            e.printStackTrace(); // this obviously needs to be refined.
		        }
		    }
		}
	}
}