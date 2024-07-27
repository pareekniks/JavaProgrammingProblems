import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		int a[] = { 10, 9, 8, 7, 5, 10, 7 };

		Set<Integer> mySet = new HashSet<>();
		for (int d : a) {
			if (mySet.add(d) == false) {
				System.out.println("Duplicate elements are " + d);
			}
		}

		Map<Integer, Integer> myMap = new HashMap<>();
		for (int d : a) {
			if (myMap.containsKey(d)) {
				myMap.put(d, myMap.get(d) + 1);
			} else {
				myMap.put(d, 1);
			}

		}

		Set<Entry<Integer, Integer>> myEntry = myMap.entrySet();

		for (Entry<Integer, Integer> entry : myEntry) {
			System.out.print(entry.getKey()+"->");
			System.out.println(entry.getValue());

		}
		System.out.println(myMap);

	}
}
