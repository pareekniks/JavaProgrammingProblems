import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5};
		
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(a));
		
		System.out.println(b);
		
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numList.removeIf(n -> n%2==0);
		System.out.println(numList);
		
		
	}

}
