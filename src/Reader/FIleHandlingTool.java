package Reader;
import java.io.*;

public class FIleHandlingTool {
	
	public static void main(String[]args) {
		String line;
		BufferedReader reader = null;
		
		
		try 
		{
			reader = new BufferedReader(new FileReader("myFile.txt"));
			line = reader.readLine();
			while (line != null)
			{
				System.out.println(line);
				line = reader.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try 
			{
				if (reader != null)
					reader.close();
			}
			catch (IOException e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
