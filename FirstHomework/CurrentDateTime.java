import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   DateFormat dateFormat = new SimpleDateFormat(" HH:mm:ss yyyy/MM/dd");
		   //get current date time with Date()
		   Date date = new Date();
		   System.out.println(dateFormat.format(date));
	}

}
