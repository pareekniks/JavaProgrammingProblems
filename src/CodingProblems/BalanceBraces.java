package CodingProblems;
import java.util.Stack;

public class BalanceBraces {

	public static void main(String[] args) {

		String a = "{([]}";
		System.out.println(checkBalance(a));

	}

	public static boolean checkBalance(String a) {
		Stack<Character> myStack = new Stack<Character>();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(' || a.charAt(i) == '{' || a.charAt(i) == '[') {
				myStack.push(a.charAt(i));
			} else if (a.charAt(i) == ')') {
				if (myStack.pop() != '(') {
					return false;
				}

			} else if (a.charAt(i) == '}') {

				if (myStack.pop() != '{') {
					return false;
				}

			} else if (a.charAt(i) == ']') {

				if (myStack.pop() != '[') {
					return false;
				}

			}

		}
		return myStack.isEmpty();
	}

}
