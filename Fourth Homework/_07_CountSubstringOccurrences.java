package fourthHomework;

import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String Text = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		int counter = 0;

		for (int i = 0; i <= Text.length() - word.length(); i++) {
			if (Text.substring(0 + i, word.length() + i).contains(word)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
