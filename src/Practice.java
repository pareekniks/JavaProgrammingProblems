import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Practice {

	public static void main(String[] args)

	{
		String a = "{()}";

		char b[] = a.toCharArray();

		Stack<Character> c = new Stack<>();

		for (Character i : b) {

			if (i == '{' || i == '[' || i == '(') {
				c.push(i);
			} else {
				if (i == '}' && c.pop() == '}') {
					continue;

				}
				else if (i == ')' && c.pop() == '(') {
					continue;
				}
				else if (i == ']' && c.pop() == '[') {
					continue;

				}
				else {
					System.out.println("Not Valid");
				}
			}
		}
	}
}
