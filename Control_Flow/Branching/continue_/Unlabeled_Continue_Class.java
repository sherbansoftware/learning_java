package Control_Flow.Branching.continue_;

public class Unlabeled_Continue_Class {
	public static void main(String[] args) {

		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;

		for (int i = 0; i < max; i++) {
			// interested only in p's
			if (searchMe.charAt(i) != 'p') {
				continue;
			}
			numPs++;
		}
		System.out.println("Found " + numPs + " p's in the string.");
	}
}
