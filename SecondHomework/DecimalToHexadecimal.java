import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal integer number: ");
		int decNum = Integer.parseInt(input.next());
		
		String hexNum = Integer.toHexString(decNum);
		hexNum = hexNum.toUpperCase();
		System.out.println(hexNum);

		input.close();
	}

}
