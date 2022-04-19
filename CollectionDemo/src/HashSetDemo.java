import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		Set<String> names1 = new TreeSet<>();
		for(int i=0;i<10;i++) {
			names.add("Ram " + i);
		}
		for(int i=0;i<10;i++) {
			names1.add("Ram " + i);
		}		
		System.out.println(names);
		System.out.println(names1);
	}
	
}
