package fourthHomework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numbers = input.nextInt();
		int[] arrayNums = new int[numbers];
		for (int i = 0; i < arrayNums.length; i++) {
			
			arrayNums[i] = Integer.parseInt(input.next());
		}
		Arrays.sort(arrayNums);
		
		for (int j = 0; j < arrayNums.length - 1; j++) {
			System.out.print(arrayNums[j] + " ");
			}
		System.out.print(arrayNums[numbers - 1]);
	}

}
