package CodingProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {

		String str = "my name is nikhil";

		String[] strArray = str.split("\\s");
		String revString = "";

		for (int i = strArray.length - 1; i >= 0; i--) {
			revString = revString + strArray[i] + " ";
		}
	//	System.out.println(revString);
		revString(str);

	}

	public static void revString(String s) {

		char[] charArray = s.toCharArray();
		char myList[] = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				myList[i]=' ';
				int s1[]= {10,29,9,8};

			}
		}
		for (int j = charArray.length - 1, k = 0; j >=0;) {
			if (charArray[j] == ' ') {
				j--;
			}
			if (myList[k] == ' ') {
				k++;
			} else {
				char temp = charArray[j];
				charArray[j]=myList[k];
				myList[k] =temp;
				j--;
				k++;
			}
		}
		
		System.out.println(String.valueOf(myList));

	}

}
