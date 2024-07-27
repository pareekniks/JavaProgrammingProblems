package CodingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CheckAnagram {

	// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

	public static void main(String[] args) {
		String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<String> myList = Arrays.asList(arr);
		List<String> myList2 = new ArrayList<>();

		for (String m : myList) {
			System.out.println(m);
			char[] a = m.toCharArray();
			Arrays.sort(a);

			myList2.add(String.valueOf(a));

		}

		System.out.println(myList2);

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int i = 0;
		for (String string : myList2) {

			if (hm.containsKey(string)) {
				hm.put(string, hm.get(string) + 1);

			} else {
				hm.put(string, 1);

			}
		}
		System.out.println(hm);
	}

}
