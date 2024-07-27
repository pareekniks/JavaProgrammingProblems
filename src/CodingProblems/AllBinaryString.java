package CodingProblems;
import java.util.ArrayList;

public class AllBinaryString {

	static ArrayList<String> res = new ArrayList<>();

	public static void main(String[] args) {
		genBin("1?0?");
		System.out.println(res);

	}

	static void genBin(String str) {

		if (str.contains("?")) {
			String s1 = str.replaceFirst("\\?", "0");
			String s2 = str.replaceFirst("\\?", "1");
			genBin(s1);
			genBin(s2);

		} else
			res.add(str);
	}

}
