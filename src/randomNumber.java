import java.util.Random;

import javax.swing.JOptionPane;

public class randomNumber {
public static void main(String[] args) {
	Random num = new Random(); 
	for (int i = 0; i < 5; i++) {
		int a = num.nextInt(50);
		a += 1; 
		JOptionPane.showMessageDialog(null, a);
	
	
}
}
}