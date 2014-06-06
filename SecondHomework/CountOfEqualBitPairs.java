import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = Integer.parseInt(input.next());
		int maxPosition = 31;
		int numOfPairs = 0;
		
		while ((1 & (number >> maxPosition)) != 1) {
			maxPosition--;
		}
		
		for (int i = 0; i < maxPosition; i++) {
			if ((((1 & (number >> i)) == 1 && (1 & (number >> i + 1)) == 1) ||
					((1 & (number >> i)) == 0 && (1 & (number >> i + 1)) == 0))) {
				numOfPairs++;
			}
			if (i == 30) {
				break;
			}
		}
		
		System.out.println("The number of equal bit pairs is " + numOfPairs);
		
		input.close();

	}

}
