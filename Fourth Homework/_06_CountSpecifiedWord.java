package fourthHomework;

import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String Specified = input.nextLine().toLowerCase();
		String Text = input.nextLine().toLowerCase();
		String[] arrayStrings = Text.split("\\W+");
		int counter = 0;
		for (int i = 0; i < arrayStrings.length; i++) {
			if (Specified.equals(arrayStrings[i]))  {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
