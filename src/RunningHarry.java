
public class RunningHarry {
	public static void main(String[] args) {
		// Create a HarryRunner class with a main method that:
				// 1. makes harry potter
		HarryPotter hairyPot = new HarryPotter();
				// 2. become invisible
		hairyPot.makeInvisible(true);
				// 3. spy on Professor Snape
		hairyPot.spyOnSnape();
				// 4. become visible again
		hairyPot.makeInvisible(false);
				// 5. cast a “stupefy” spell
		hairyPot.castSpell("stupefy");
	}
}
