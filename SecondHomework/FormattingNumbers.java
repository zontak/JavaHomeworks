import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers(integer and 2 floating- point numbers), each on a new line");
		int a = Integer.parseInt(input.next());
		String aAsHex = Integer.toHexString(a).toUpperCase();
		String aAsBin = Integer.toBinaryString(a);
		String paddedAAsBin = "0000000000".substring(aAsBin.length()) + aAsBin;
		
		float b = Float.parseFloat(input.next());
		float c = Float.parseFloat(input.next());
		
		System.out.printf("|%1$-10s|%2$10s|%3$10.2f|%4$-10.3f|", aAsHex, paddedAAsBin, b, c);

		input.close();
	}

}
