import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the x and y points of A (each on a new line):");
		float aX = input.nextFloat();
		float aY = input.nextFloat();
		
		System.out.println("Enter the x and y points of B (each on a new line):");
		float bX = input.nextFloat();
		float bY = input.nextFloat();
		
		System.out.println("Enter the x and y points of C (each on a new line):");
		float cX = input.nextInt();
		float cY = input.nextInt();
		
		float area = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
		int roundedArea = (int)(area + 0.5);
		
		System.out.println("The area is: " + roundedArea);
		
		input.close();
	}

}
