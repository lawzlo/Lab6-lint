import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance {

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		
		Locale deLocale, frLocale, enLocale, currentLocale = null;
		ResourceBundle messages = null, demessages, frmessages, enmessages;
		
		deLocale = new Locale("de", "DE");
		enLocale = new Locale("en", "US");
		frLocale = new Locale("fr", "FR");
		
		demessages = ResourceBundle.getBundle("MessagesBundle_de_DE", deLocale);
		enmessages = ResourceBundle.getBundle("MessagesBundle_en_US", enLocale);
		frmessages = ResourceBundle.getBundle("MessagesBundle_fr_FR", frLocale);
		
		
		System.out.println("Please choose langauge: ");
		System.out.println("1: English; 2: Germany; 3: French; ");
		int choice = scanInput.nextInt();
		if (choice == 1) {
				
			messages = enmessages;
			currentLocale = enLocale;
		} else if (choice == 2) {
			messages = demessages;
			currentLocale = deLocale;
		} else if (choice == 3) {
			messages = frmessages;
			currentLocale = frLocale;
		} else {
			
			System.out.println("Please choose again.");
		}
			
		//Greeting
		System.out.println(messages.getString("greeting"));
		
		
		//Get User's Name
		System.out.println(messages.getString("askName"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("printName") + name);
		
		//print today's date, balance and bid goodbye
		NumberFormat currency = NumberFormat.getCurrencyInstance(currentLocale);
		DateFormat datef = DateFormat.getDateInstance(DateFormat.LONG, currentLocale);
		System.out.println(messages.getString("date") + datef.format(today));
		System.out.println(messages.getString("school") + currency.format(9876543.21));
		System.out.println(messages.getString("bye"));


		
	}
}
