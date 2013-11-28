import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inString;
		double l;

		inString = in.nextLine();
		l = Double.parseDouble(inString);

		while (l != 0) {
			int i = 2;
			l -= 1.0/i;
			while (l > 0) {
				i++;
				l -= 1.0/i;
			}
			
			System.out.println((i-1) + " card(s)");

			inString = in.nextLine();
			l = Double.parseDouble(inString);
		}
	}
}