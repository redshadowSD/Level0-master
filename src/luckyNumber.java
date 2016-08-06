import java.util.Random;

import javax.swing.JOptionPane;

public class luckyNumber {
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Input a number between 1 - 50");
		int num = Integer.parseInt(userInput);
		Random r = new Random();
		int rand = r.nextInt(50) + 1;
		int ctr = 0;
		for (ctr = 0 ; rand!= num ; ctr++) {
		rand = r.nextInt(50) +1 ; 
		}
		System.out.println(ctr);
		ctr = 0; 
		
	}
}
