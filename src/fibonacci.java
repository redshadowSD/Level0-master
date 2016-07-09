
public class fibonacci {
	public static void main(String[] args) {
		int back1 = 1;
		int back2 = 1;
		for (int i = 0; i < 5; i++) {
			int a = back1+ back2;
			 back1 = back2; 
			 back2 = a; 
			System.out.println(a);
			
		}
	}
}
