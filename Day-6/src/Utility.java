
public class Utility {
	
	public static void ValidateInput(int row) {
		
		if(row<=0) {
			throw new IllegalArgumentException("Row must be Greater than zero");
		}
		
	}

}
