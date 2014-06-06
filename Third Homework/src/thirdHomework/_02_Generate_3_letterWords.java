package thirdHomework;

import java.util.Scanner;

public class _02_Generate_3_letterWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String wordsString = input.nextLine();
		String result = "";
		
		for (int i = 0; i < wordsString.length(); i++) {
			for (int j = 0; j < wordsString.length(); j++) {
				for (int k = 0; k < wordsString.length(); k++) {
					result = "" + wordsString.charAt(i) + wordsString.charAt(j) + wordsString.charAt(k);  
					System.out.print(result + " ");
				}
			}
		}
	}

}
