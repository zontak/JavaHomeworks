package fourthHomework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String phoneRegEx = "[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}";
		Pattern phonePattern = Pattern.compile(phoneRegEx);
		Matcher matcher = phonePattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
