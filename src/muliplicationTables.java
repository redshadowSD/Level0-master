import javax.swing.JOptionPane;

public class muliplicationTables {
	public static void main(String[] args) {
		String z = JOptionPane.showInputDialog("What multiplication table do you want?");
		int number = Integer.parseInt(z);
		for (int i = 0; i < 12; i++) {
			printMulitiplication(number, i);
		}

	}

	public static void printMulitiplication(int a, int b) {
		System.out.println(a + " X " + b + " = " + a * b);
	}

}
