import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		String [] country = new String[number + 1];
		for(int i = 0;i<=number;i++)
		{
			country[i] = in.next(); 
		}
		Arrays.sort(country);
		for(int i = 0;i<country.length;i++)
		{
		  System.out.println(country[i]);
		}
	}

}