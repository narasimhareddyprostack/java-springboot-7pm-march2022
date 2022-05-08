//WAP to print no of files and subdirecties
import java.io.File;

public class NoFiles {

	public static void main(String[] args) {
		File f = new File("D:\\scart");
		String[] fileNames = f.list();
		int count = 0;
		for(String fileName:fileNames) {
			File f1 = new File(f,fileName);
			if(!f1.isFile()) {
				count++;
				System.out.println(fileName);
			}
			//count++;
			//System.out.println(fileName);
		}
		System.out.println(count);
	}

}
