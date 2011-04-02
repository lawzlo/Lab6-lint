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

	public Date today = new Date();
	
	public String name = new String();
	public Locale deLocale, frLocale, enLocale, currentLocale = null;
	public ResourceBundle messages = null, demessages, frmessages, enmessages;
	
	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */
	public void Init() {
	
//		Scanner scanInput = new Scanner(System.in);
		this.deLocale = new Locale("de", "DE");
		this.enLocale = new Locale("en", "US");
		this.frLocale = new Locale("fr", "FR");
		
		this.demessages = ResourceBundle.getBundle("MessagesBundle_de_DE", this.deLocale);
		this.enmessages = ResourceBundle.getBundle("MessagesBundle_en_US", this.enLocale);
		this.frmessages = ResourceBundle.getBundle("MessagesBundle_fr_FR", this.frLocale);
		
		
//		System.out.println("Please choose langauge: ");
//		System.out.println("1: English; 2: Germany; 3: French; ");
/*		int choice = scanInput.nextInt();
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
		} */
			
		//Greeting
//		System.out.println(messages.getString("greeting"));
		
		
		//Get User's Name
//		System.out.println(messages.getString("askName"));
		 //= scanInput.nextLine();
//		System.out.println(messages.getString("printName") + name);
		
		//print today's date, balance and bid goodbye
		
		
//		System.out.println(messages.getString("date") + datef.format(today));
//		System.out.println(messages.getString("school") + currency.format(9876543.21));
//		System.out.println(messages.getString("bye"));
		
	}
	
	public String date(){
		
		DateFormat datef = DateFormat.getDateInstance(DateFormat.LONG, this.currentLocale);
		return this.messages.getString("date") + datef.format(today); 
	}
	
	
	public String greeting(){
		return this.messages.getString("greeting"); 
	}
	
	public String askName(){
		return this.messages.getString("askName");
	}
	
	public String printName(){
		return this.messages.getString("printName") + this.name;
	}
	
	public String bye(){
		return this.messages.getString("bye");
	}
	
	public String school(){
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(this.currentLocale);
		return this.messages.getString("school") + currency.format(987654.21);
	}
	
	
	
	
}
