// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentSavings = Integer.parseInt(args[0]);
		double intrestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		int futureValue = (int) (currentSavings * Math.pow(1 + (intrestRate / 100), years));

		System.out.println(String.format("After %d years, a $%d saved at %.1f%% will yield $%d ", years, currentSavings,
				intrestRate, futureValue));

	}
}