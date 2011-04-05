import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;


/**
 * Test class for PrintBalance
 *
 * @author Tan.
 *         Created Apr 2, 2011.
 */
public class TestPrintBalance {
	
	@Test
	public void TestEnglish(){
		Date today = new Date();
		DateFormat datef = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
		
		PrintBalance temp = new PrintBalance();
		temp.Init();
		temp.currentLocale = temp.enLocale;
		temp.name = "Someone";
		temp.messages = temp.enmessages;
		assertEquals("Hello World", temp.greeting());
		assertEquals("Please enter your name ", temp.askName());
		assertEquals("I am pleased to meet you Someone", temp.printName());
		assertEquals("As of : " + datef.format(today), temp.date());
		assertEquals("You owe the school $987,654.21", temp.school());
		assertEquals("Good Bye", temp.bye());
	}
	
	
	@Test
	public void TestGermany(){
		Date today = new Date();
		DateFormat datef = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de", "DE"));
		
		PrintBalance temp = new PrintBalance();
		temp.Init();
		temp.currentLocale = temp.deLocale;
		temp.name = "Someone";
		temp.messages = temp.demessages;
		assertEquals("Hallo Welt", temp.greeting());
		assertEquals("Bitte geben Sie Ihren Namen ", temp.askName());
		assertEquals("Ich freue mich, Sie kennen zu lernen Someone", temp.printName());
		assertEquals("Wie der : " + datef.format(today), temp.date());
		assertEquals("Du schuldest der Schule 987.654,21 €", temp.school());
		assertEquals("Good Bye", temp.bye());
		
	}
	
	@Test
	public void TestFrench(){
		Date today = new Date();
		DateFormat datef = DateFormat.getDateInstance(DateFormat.LONG, new Locale("fr", "FR"));
		
		PrintBalance temp = new PrintBalance();
		temp.Init();
		temp.currentLocale = temp.frLocale;
		temp.name = "Someone";
		temp.messages = temp.frmessages;
		assertEquals("Bonjour tout le monde", temp.greeting());
		assertEquals("S'il vous plaît entrer votre nom ", temp.askName());
		assertEquals("Je suis heureux de vous rencontrer Someone", temp.printName());
		assertEquals("Comme des : " + datef.format(today), temp.date());
		assertEquals("Vous devez l'école 987 654,21 €", temp.school());
		assertEquals("Good Bye", temp.bye());
		
	}
	
	
}
