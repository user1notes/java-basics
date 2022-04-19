import java.io.FileWriter;
import java.io.IOException;

public class ForLoopDemo extends Utility {

	public static void PrintWithDoWhile(int row) {
		do {
			int column = row;
			do {
				System.out.print("*");
				column--;

			} while (column > 0);

			System.out.println();
			row--;
		} while (row > 0);
	}

	public static void printWithWhile(int row, char pattern) {
		/**
		 * Printing pattern using while loop
		 */
		
		Utility.ValidateInput(row);
		
		while (row > 0) {
			int column = row;
			while (column > 0) {
				System.out.print(pattern);
				column--;
			}
			row--;
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		
		String result = "";
		for (int row = 0; row < 5; row++) {
			for (int column = 5; column > row; column--) {
				System.out.print("*");
				result = result + "*";
			}
			System.out.println();
			result = result + "\n";
		}
		printWithWhile(0, '$');
		writefile("output.txt", result);
		PrintWithDoWhile(5);

	}

	private static void writefile(String fileName, String txt) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		writer.write(txt);
		System.out.println("----Completed Writing----");
		writer.close();

	}

}
