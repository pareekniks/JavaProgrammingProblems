
public class StringManupulation {

	public static void main(String[] args) {
		String str = "The Rains have started here";

		System.out.println(str.length());
		System.out.println(str.charAt(8));

		System.out.println(str.indexOf('e'));

		String a = "Hello";
		String b = "World";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println(a);
		System.out.println(b);
	}

}
