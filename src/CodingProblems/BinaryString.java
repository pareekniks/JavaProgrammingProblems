package CodingProblems;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {

	public static void main(String[] args) {

		String s = "1?0";
		char[] ab = s.toCharArray();
		List<String> sArray = new ArrayList<String>();
		helper(ab, 0, sArray);
		System.out.println(sArray);

	}

	public static void helper(char[] ab, int i, List<String> sArray) {

 		if (i == ab.length) {
			String b = String.valueOf(ab);
			sArray.add(b);
			return;

		}
		if (ab[i] == '?') {
			ab[i] = '0';
			helper(ab, i+1, sArray);
			ab[i] = '1';
			helper(ab, i+1, sArray);
			ab[i] = '?';
		} else 
			helper(ab, i+1, sArray);
		
	}

}
