package fourthHomework;

import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		int[] numbers = new int[input.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}

		int counter = 1;
		int sequenceLength = 1;
		int end = 0;            

		System.out.printf("%d ", numbers[0]);
		for (int i = 1; i < numbers.length; i++) {

			if(numbers[i] > numbers[i - 1]){
				counter++;
				System.out.printf("%d ", numbers[i]);
			} else {
				counter = 1;
				System.out.printf("\n%d ", numbers[i]);
			}

			if(counter > sequenceLength){
				sequenceLength = counter;
				end = i;
			}
		}

		int start = end - sequenceLength + 1; 
		System.out.println();

		System.out.print("Longest: ");
		for (int i = start; i <= end; i++) {
			System.out.printf("%d ", numbers[i]);
		}
	}
}
