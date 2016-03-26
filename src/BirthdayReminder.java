 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String name = JOptionPane.showInputDialog("Whoose birthday do you want to remember");
	
		// 3. Print out what the user typed
		if (name.equalsIgnoreCase("mom")) 
		{
			System.out.println(momsBirthday);
		}else {
			System.out.println("Sorry, I don't remeber that person's birthday");
		}
		
		if (name.equalsIgnoreCase("dad")) 
		{
			System.out.println(dadsBirthday);
		}else {
			System.out.println("Sorry, I don't remeber that person's birthday");
		}
		
		if (name.equalsIgnoreCase("my")) 
		{
			System.out.println(myBirthday);
		}else {
			System.out.println("Sorry, I don't remeber that person's birthday");
		}
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}