import java.util.Scanner;
import java.util.Arrays;

public class aaa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String quanStr = in.nextLine();
		if (!quanStr.equals("")) {
			int quantity = Integer.parseInt(quanStr);
			int[][] numbers = new int[10][quantity];
			boolean found = false;
			int[] pos = new int[10];
			for (int i = 0; i < 10; i++) {
				pos[i] = 0;
			}
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
				int no = Integer.parseInt(read);
				int row = no/1000000;
				numbers[row][pos[row]] = no;
				pos[row] = pos[row]+1;
			}
			for (int i = 0; i < 10; i++) {
				if (pos[i] > 1) {
					numbers[i] = Arrays.copyOfRange(numbers[i], 0, pos[i]);
					Arrays.sort(numbers[i]);
					for (int j = 0; j < pos[i]-1; j++) {
						int count = 1;
						while (numbers[i][j] == numbers[i][j+1]){
							found = true;
							count++;
							j = j+1;
							if (j >= pos[i] - 1) break;
						}
						if (count != 1) {
							System.out.printf("%03d-%04d %d\n",numbers[i][j]/10000,numbers[i][j]%10000,count);
						}
					}
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