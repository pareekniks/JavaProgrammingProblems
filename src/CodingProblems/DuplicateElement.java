package CodingProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElement {

	public static void main(String[] args) {

		String arr[] = { "java", "c", "c++", "python", "java" };
		
		int b[] = { 1,2,3,6,8,9,1,1,2};

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);

			} else {
				hm.put(arr[i], 1);
			}

		}

		System.out.println(hm);

		for (Map.Entry<String, Integer> a : hm.entrySet()) {
			if(a.getValue()>1) {
			System.out.println(a.getKey() + a.getValue());
			}
		}
		
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(Integer s:b) {
			if(hs.add(s)) {
				
			}
			else {
				System.out.println("Duplicate Value "+ s);
			}
		}

	}

}
