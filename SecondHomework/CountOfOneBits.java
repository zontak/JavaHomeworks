import java.util.Scanner;


public class CountOfOneBits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		int number = Integer.parseInt(input.next());
		
		int maxPosition = 16;
		int bitCounter = 0;
		
		for (int i = 0; i < maxPosition; i++) {
			if ((1 & (number >> i)) == 1) {
				bitCounter++;
			}
		}
		System.out.println("The number of bits is " + bitCounter);
		
		input.close();
	}

}
