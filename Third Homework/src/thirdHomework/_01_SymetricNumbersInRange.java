package thirdHomework;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class _01_SymetricNumbersInRange {

	private static boolean isSymmetric(int n) {
		char[] charArr = Integer.toString(n).toCharArray();
		boolean isSymmetric = true;
		for (int i = 0, j = 1; i < charArr.length; i++, j++) {
			if (isSymmetric) {
				if (charArr[i] != charArr[charArr.length - j]) {
					isSymmetric = false;
				}
			}
		}
		return isSymmetric;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		for (int i = start; i <= end; i++) {
			if (isSymmetric(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
