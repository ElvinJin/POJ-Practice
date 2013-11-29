import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String read;
		while (in.hasNextLine()) {
			read = in.nextLine();
			if (read.equals("")) break;

			String[] tokens = read.split(" ");//tokens[0] is the BigDecimal, token[1] is the exponential.
			if (tokens[1].equals("")) tokens = read.split("  ");

			BigDecimal a = new BigDecimal(tokens[0]);
			int b = Integer.parseInt(tokens[1]);
			BigDecimal ans = a.pow(b);
			String out = ans.stripTrailingZeros().toPlainString();
			out = out.replaceFirst("^0+(?!$)", "");
			System.out.println(out);
		}
	}
}