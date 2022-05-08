import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);	
		bw.write(99);
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("Good Morning");
		
		bw.newLine();
		bw.write("File Handling");
		bw.flush();
		bw.close();
	}

}
