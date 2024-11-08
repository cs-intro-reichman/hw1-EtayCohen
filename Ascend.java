// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);

		int a = (int) (Math.random() * limit);
		int b = (int) (Math.random() * limit);
		int c = (int) (Math.random() * limit);

		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = a + b + c - min - max;

		System.out.println(String.format("%d %d %d", a, b, c));
		System.out.println(String.format("%d %d %d", min, mid, max));
	}
}
