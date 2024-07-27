package CodingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {

//		Given an array of N integers. Find the first element that occurs at least K number of times.
//		 
//
//		Example 1:
//
//		Input :
//		N = 7, K = 2
//		A[] = {1, 7, 4, 3, 4, 8, 7}
//		Output :
//		4
//		Explanation:
//		Both 7 and 4 occur 2 times. 
//		But 4 is first that occurs 2 times
//		As at index = 4, 4 has occurred 
//		atleast 2 times whereas at index = 6,
//		7 has occurred atleast 2 times.

		int arr[] = { 1, 7, 4, 3, 4, 8, 7,7,4};
		Map<Integer, Integer> hm = new TreeMap<Integer, Integer>();

		for (Integer a : arr) {

			if (hm.containsKey(a)) {

				hm.put(a, hm.get(a) + 1);
			}

			else {
				hm.put(a, 1);
			}

		}

		System.out.println(hm);

		int key = 3;

		for (Entry<Integer, Integer> ab : hm.entrySet()) {

			if (key == ab.getValue()) {
				System.out.println(ab.getKey());
				break;

			}

		}

		// System.out.println(hm.getOrDefault(4, null));;

	}

}
