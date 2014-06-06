import java.util.Scanner;


public class SmallestOfThreeNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the three numbers each on a new line:");
		double[] nums = new double[3];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Double.parseDouble(input.next());
		}
		
		double minNum = Math.min(nums[0], Math.min(nums[1], nums[2]));
		
		System.out.println("The smallest number is: " + minNum);
	
		input.close();
	}

}
