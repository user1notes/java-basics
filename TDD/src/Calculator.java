
public class Calculator {
	public int add(Integer a, Integer b) {
		if(a==0)
			return b;
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int divide(int a, int b) {
		if(b==0)
			return 0;
		
		return a/b;
	}
}
