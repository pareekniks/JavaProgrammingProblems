import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestToZero {

	public static void main(String[] args) {

		int nums[] = { -99, 99, -98, 98, -97, 97, -96, 96, -95, 95, -94, 94, -93, 93, -92, 92, -91, 91, -90, 90, -89,
				89, -88, 88, -87, 87, -86, 86, -85, 85, -84, 84, -83, 83, -82, 82, -81, 81, -80, 80, -79, 79, -78, 78,
				-77, 77, -76, 76, -75, 75, -74, 74, -73, 73, -72, 72, -71, 71, -70, 70, -69, 69, -68, 68, -67, 67, -66,
				66, -65, 65, -64, 64, -63, 63, -62, 62, -61, 61, -60, 60, -59, 59, -58, 58, -57, 57, -56, 56, -55, 55,
				-54, 54, -53, 53, -52, 52, -51, 51, -50, 50 };
		System.out.println(findSmallest(nums));

	}

	static int findSmallest(int a[]) {

		Arrays.sort(a);

		List<Integer> b = new ArrayList<>();
		int smallest = a[0];
		int distance;

		for (int i = 0; i < a.length; i++) {
			distance = Math.abs(a[i]);
			if (smallest >= distance || i == 0) {
				smallest = distance;
			} else {
				// System.out.println(smallest);
				return a[i - 1];
			}
		}

		return -1;
	}

}
