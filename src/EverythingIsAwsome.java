import javax.swing.JOptionPane;

public class EverythingIsAwsome 
{
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog(null,"What's Your Favorite Thing?");
	JOptionPane.showMessageDialog(null, question + " Is AWSOME!!!!!");
}
}
