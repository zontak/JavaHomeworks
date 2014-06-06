package thirdHomework;

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] cards = new String[] { 
				"2", "3", "4", "5",
				"6", "7", "8", "9",
				"10", "J", "Q", "K", "A",
		};
		String[] suit = new String[] {
				"♣", "♦", "♥", "♠"
		};
		
		Random random = new Random();

		for (int i = 0; i < number; i++) {
			System.out.printf("%s%s %s%s %s%s %s%s %s%s" ,
					cards[random.nextInt(13)],suit[random.nextInt(4)],
					cards[random.nextInt(13)],suit[random.nextInt(4)],
					cards[random.nextInt(13)],suit[random.nextInt(4)],
					cards[random.nextInt(13)],suit[random.nextInt(4)],
					cards[random.nextInt(13)],suit[random.nextInt(4)]);
			System.out.println();
		}

	}

}
