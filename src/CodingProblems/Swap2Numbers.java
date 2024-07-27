package CodingProblems;

public class Swap2Numbers {

	public static void main(String[] args) {

		int a = 8;
		int b = 10;

		b = a + b; // 18
		a = b - a; // 10
		b = b - a;

		System.out.print("Addition Logic");
		System.out.println(a);
		System.out.println(b);

		int c = 20;
		int d = 40;
		c = c * d;
		d = c / d;
		c = c / d;
		System.out.print("Multiplication Logic");
		System.out.println(c);
		System.out.println(d);

		int g = 10;
		int h = 20;
		h = g + h - (g = h);

		System.out.println(g);
		System.out.println(h);

	}

}
