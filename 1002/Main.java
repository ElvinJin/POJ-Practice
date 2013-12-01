import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String quanStr = in.nextLine();
		if (!quanStr.equals("")) {
			int quantity = Integer.parseInt(quanStr);
			int[] numbers = new int[quantity];
			boolean found = false;
			for (int i = 0; i < quantity; i++) {
				String read = in.nextLine();
				read = read.replace("-","");
				read = read.replaceAll("A|B|C","2");
				read = read.replaceAll("D|E|F","3");
				read = read.replaceAll("G|H|I","4");
				read = read.replaceAll("J|K|L","5");
				read = read.replaceAll("M|N|O","6");
				read = read.replaceAll("P|R|S","7");
				read = read.replaceAll("T|U|V","8");
				read = read.replaceAll("W|X|Y","9");
				numbers[i] = Integer.parseInt(read);
			}
			Arrays.sort(numbers);
			for (int i = 0; i < quantity-1; i++) {
				int count = 1;
				while (numbers[i] == numbers[i+1]) {
					found = true;
					count++;
					i = i+1;
					if (i >= quantity-1) break;
				}
				if (count != 1) {
					System.out.printf("%03d-%04d %d\n",numbers[i]/10000,numbers[i]%10000,count);
				}
			}
			if (!found) {
				System.out.println("No duplicates. ");
			}
		} else {
			System.out.println("No duplicates. ");
		}
	}
}