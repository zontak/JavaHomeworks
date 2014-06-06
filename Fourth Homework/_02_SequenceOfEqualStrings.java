package fourthHomework;

import java.util.Scanner;

public class _02_SequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arrayString = str.split(" ");

		System.out.println(arrayString[0]);
		for (int i = 1; i < arrayString.length; i++) {
			if ( arrayString[i].equals(arrayString[i - 1])) {
				System.out.print(" " + arrayString[i]);
			}
			else {
				System.out.println();
				System.out.print(arrayString[i]);
			}
			input.close();
		}
		

	}

}
