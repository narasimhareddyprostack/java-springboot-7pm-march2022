import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEc {

	public static void main(String[] args) throws IOException {
	FileReader r = new FileReader("abc.txt");
	
	BufferedReader br = new BufferedReader(r);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line = br.readLine();
	}
	}

}
