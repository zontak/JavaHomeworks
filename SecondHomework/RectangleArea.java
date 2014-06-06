import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter rectangle side a: ");
		int sideA = input.nextInt();
		
		System.out.print("Enter rectangle side b: ");
		int sideB = input.nextInt();
		
		int rectangleArea = sideA * sideB;
		System.out.println("The rectangle area is: " + rectangleArea);

		input.close();
	}

}
