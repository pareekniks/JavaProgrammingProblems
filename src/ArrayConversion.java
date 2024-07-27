import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {

	public static void main(String[] args) {

		String[] arr = { "t", "r", "v" };

		String a = "";
		for (int i = 0; i < arr.length; i++) {
			a = a + arr[i];
		}
		System.out.println(a);

		System.out.println(String.join(";", arr));
		System.out.println(Arrays.asList(arr).stream().collect(Collectors.joining("|")));

		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			if (s != null) {
				sb.append(s);
			}
		}

		System.out.println("StringBuilder " + sb);

	}

}
