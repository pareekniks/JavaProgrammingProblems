package CodingProblems;

import java.util.Arrays;
import java.util.Collections;

public class CheckMinMax {

	public static void main(String[] args) {
		
		Integer a[] = { 3, 1,999, 2, 4, 6, 5, 8, 9 };
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		
		System.out.println(max);
		
		
//		Arrays.sort(a);
	//	Arrays.parallelSort(a);
	//	Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(a[a.length-1]);

	}

}
