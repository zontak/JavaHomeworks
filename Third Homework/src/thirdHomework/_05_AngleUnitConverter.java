package thirdHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		ArrayList<Double> convertedList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			double value = scanner.nextDouble();
			String measure = scanner.next();
			convertedList.add(unitConverter(value, measure));
		}
		System.out.println();
		for (Double converted : convertedList) {
			System.out.printf("%.6f\n", converted);
		}
	}

	private static double unitConverter(double value, String measure) {
		if (measure.equals("rad"))
			return Math.toDegrees(value);
		else
			return Math.toRadians(value);
	}
}