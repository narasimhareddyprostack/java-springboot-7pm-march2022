import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException 
	{
	FileWriter fw = new FileWriter("test.txt", true);
	//writing sequnece of char data in file
	
	fw.write("Hello");		
	fw.write("GM");
	fw.write("\n");
	fw.write("Welcome");
	fw.write(99);
	fw.flush();
	fw.close();
	}
}
