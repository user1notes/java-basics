import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		readfile("input.txt");
		writefile("output.txt","I am writing into file");
		writefile("output1.txt","Writing in another file");
		
	}
	
	private static void writefile(String fileName, String txt) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		writer.write(txt);
		System.out.println("----Completed Writing----");
		writer.close();
		readfile(fileName);
		
	}

	public static void readfile(String fileName) throws IOException {
		FileReader reader = new FileReader(fileName);
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line = bufferedreader.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line = bufferedreader.readLine();
		}

	}

}
