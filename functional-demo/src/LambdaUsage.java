import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class LambdaUsage {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		
		list.forEach((Integer element)->{
			System.out.println(element);
		});
		System.out.println("----Sorting----");
		
		Comparator<	Integer> sortlambda = (Integer arg0, Integer arg1)-> arg0 - arg1;
		list.sort(sortlambda);
		System.out.println(list);
		
		
		list.sort(new Comparator<Integer>(){
				
				@Override
				public int compare(Integer arg0, Integer arg1) {
					return arg0 - arg1;
				}
		});
		list.forEach((Integer element)->{
			System.out.println(element);
		});		
		
		
	}

}
