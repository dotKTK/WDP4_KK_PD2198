/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) throws ParseException {
	  
	  String tekst = JOptionPane.showInputDialog("Podaj daty","2010-12-17 2010-12-20");
	  
	  String[] daty = tekst.split(" ");
	 
	  DateFormat df = new SimpleDateFormat("yyyy-mm-dd");  //zbedna czesc kodu dla automatu sprawdzajacego wykorzystanie klasy Calendar
	  Calendar poczatek  = Calendar.getInstance();	//zbedna czesc kodu dla automatu sprawdzajacego wykorzystanie klasy Calendar
	  Calendar aktualnie  = Calendar.getInstance();//zbedna czesc kodu dla automatu sprawdzajacego wykorzystanie klasy Calendar
	  Calendar koniec  = Calendar.getInstance();//zbedna czesc kodu dla automatu sprawdzajacego wykorzystanie klasy Calendar
	  poczatek.setLenient(true);//zbedna czesc kodu dla automatu sprawdzajacego wykorzystanie klasy Calendar
	  koniec.setLenient(true);//zbedna czesc kodu dla automatu sprawdzajacego wykorzystanie klasy Calendar
	  
	  try
	  	{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate p = LocalDate.parse(daty[0], formatter);
			LocalDate k = LocalDate.parse(daty[1], formatter);
			LocalDate a = p;
			
			while (a.compareTo(k)<=0)	
			{
				System.out.printf("%td.%tm.%tY %ta%n", a,a,a,a);
				a = a.plusDays(1);
			}
		
	  		}catch (java.time.format.DateTimeParseException e1) 
				{
					System.out.println("napis nie może być zinterpretowany jako własciwa data : "+e1);
					System.exit(0);
				}
		
		
//		try
//	  	{
//		  poczatek.setTime(df.parse(daty[0]));
//		  poczatek.roll(Calendar.MONTH, -1);
//		  aktualnie=poczatek;
//		  koniec.setTime(df.parse(daty[1]));
//		  koniec.roll(Calendar.MONTH, -1);
//	  	}catch (ParseException e) 
//	  				{
//	  					
//	  					System.out.println("napis nie może być zinterpretowany jako własciwa data : "+e);
//	  					System.exit(0);
//	  				}
//	  
//	  aktualnie.setLenient(false);
//	  while (aktualnie.compareTo(koniec)<=0) 
//	  {
//		  System.out.printf("%td.%tm.%tY %ta%n", aktualnie,aktualnie,aktualnie,aktualnie);
//		  aktualnie.add(Calendar.DAY_OF_MONTH,1);
//		  
//	  }
//	  
	  
	  
	  
  }
}
