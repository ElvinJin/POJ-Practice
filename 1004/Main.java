import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		Double totalBalance = 0.0;
		for (int i = 0; i < 12; i++) {
			inStr = in.nextLine();
			totalBalance += Double.parseDouble(inStr);
		}
		String average = String.format("%.2f", totalBalance/12);
		System.out.print("$"+ average);
	}
}