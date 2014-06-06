import java.util.Scanner;


public class PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the X coordinate: ");
		float x = Float.parseFloat(input.next());
		
		System.out.println("Enter the Y coordinate: ");
		float y = Float.parseFloat(input.next());
		
		if ((y <= 13.5 && y >= 6) && (x <= 17.5 && x >= 12.5)) {
			System.out.println("Inside");
		}
		else if ((y <= 8.5 && y >= 6) && (x <= 20 && x >= 17.5)) {
			System.out.println("Inside");
		}
		else if ((y <= 13.5 && y >= 6) && (x <= 22.5 && x >= 20)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		
		input.close();
	}

}
