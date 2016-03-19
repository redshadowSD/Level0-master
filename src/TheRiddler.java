import java.net.URI;
import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int b = 1; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog("Name one keys that don't unlock doors?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (a.equalsIgnoreCase("monkey")) 
{
	JOptionPane.showMessageDialog(null, "correct!!!");
	System.out.println(b++);
	playVideo("https://www.youtube.com/watch?v=mQJcObz1k_E");
}
else
{
JOptionPane.showMessageDialog(null, "sorry your uncorrect, the answer is monkey, turkey and donkey");	
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
int e = 1;
String f = JOptionPane.showInputDialog("What Color is Orange?");
if (f.equalsIgnoreCase("Orange"))
{
	
	
	JOptionPane.showMessageDialog(null, "It's correct!!! You win " + b++ + " point");
	
}
else
{
	JOptionPane.showMessageDialog(null, "GO Back TO SCHOOL!!!");
	JOptionPane.showMessageDialog(null, "You win 0 points" );
}
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

