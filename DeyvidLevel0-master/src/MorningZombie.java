import javax.swing.JOptionPane;

public class MorningZombie {
	
	public static void main(String[] args) {
		String Days = JOptionPane.showInputDialog("What day is it?");

		if (Days.equalsIgnoreCase("Monday")) {
			JOptionPane.showMessageDialog(null,"Your to do list is: 1.Wake Up 2. Change in school clothes 2. Eat Brakefest 3.Go to school 4. come home. 5. Go to Reality Changer 6.Do home work 7. sleep");

		}
		if (Days.equalsIgnoreCase("Tuesday")) 
		{
			TuesdayAndThursdayToDoList();
	}
		if (Days.equalsIgnoreCase("Wednesday")) 
		{
			
		}
		if (Days.equalsIgnoreCase("Thursday")) 
		{
			TuesdayAndThursdayToDoList();
	}
	}
	
	public static void TuesdayAndThursdayToDoList() 
	{
		JOptionPane.showMessageDialog(null,"Your to do list is: 1.Wake Up 2. Change in school clothes 2. Eat Brakefest 3.Go to school 4. come home. 5. Go to toutoring 6.Do home work 7. come home 8.free time 9.sleep");
	}
	public static void WednesdayAndFriday() 
	{
	JOptionPane.showMessageDialog(null, "");	
	}
}
