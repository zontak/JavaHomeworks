package fourthHomework;

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		String[] wordsString = string.split("\\W+");
		System.out.println(wordsString.length);
	}

}
