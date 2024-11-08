// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		double bill = Double.parseDouble(args[3]);
		double amount = Math.ceil(bill / 3);

		System.out.println(String.format("Dear %s, %s, and %s: pay %.1f Shekels each.", name3, name2, name1, amount));
	}
}
