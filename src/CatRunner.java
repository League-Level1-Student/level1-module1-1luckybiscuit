
public class CatRunner {
	public static void main(String[] args) {
			/* Do the following things without changing the Cat class */
			
			// Create a CatRunner class with a main method that creates a Cat object.
		Cat garfield = new Cat("Garfield");
	        // 1. Make the Cat meow
		garfield.meow();
			// 2. Get the Cat to print it's name
		garfield.printName();
			// 3. Kill the Cat!
		for(int i = 0;i<9;i++) {
			garfield.kill();
		}
	}
}
