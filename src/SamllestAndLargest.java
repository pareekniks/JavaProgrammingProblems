
public class SamllestAndLargest {

	public static void main(String[] args) {

		int numbers[] = { -20, 24, 60, -9, 7878 ,-88888};
		int largest = numbers[0];
		int smallest = numbers[1];
		for (int a : numbers) {
			if (a > largest) {
				largest = a;
			} else if (a < smallest) {
				smallest = a;
			}
		}

		System.out.println(smallest);
		System.out.println(largest);

	}

}
