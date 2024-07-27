package CodingProblems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static void main(String[] args) {

		String one = "Mother In Law";
		String two = "Hitler Woman";
		System.out.println(anagramEquals(one, two));
		System.out.println(anagramMap(one, two));

	}

	public static boolean anagramEquals(String a, String b) {
		char[] oneArray = a.toLowerCase().replaceAll("\\s","").toCharArray();
		char[] twoArray = b.toLowerCase().replaceAll("\\s","").toCharArray();
		Arrays.sort(oneArray);
		Arrays.sort(twoArray);
		return Arrays.equals(oneArray, twoArray);
	}

	public static boolean anagramMap(String c, String d) {
		String a = c.toLowerCase().replaceAll("\\s","");
		String b = d.toLowerCase().replaceAll("\\s","");

		HashMap<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			if (myMap.containsKey(a.charAt(i))) {
				myMap.put(a.charAt(i), myMap.get(a.charAt(i)) + 1);
			} else {
				myMap.put(a.charAt(i), 1);
			}
		}
		HashMap<Character, Integer> myMap2 = new HashMap<>();
		for (int i = 0; i < b.length(); i++) {
			if (myMap2.containsKey(b.charAt(i))) {
				myMap2.put(b.charAt(i), myMap2.get(b.charAt(i)) + 1);
			} else {
				myMap2.put(b.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("Key is " + key + " " + "Value is " + val);

		}
		myMap.entrySet();

		return myMap.equals(myMap2);

	}

}
