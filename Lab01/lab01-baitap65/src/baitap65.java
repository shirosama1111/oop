import java.util.Scanner;
public class baitap65 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] parts = input.split(" ");
			int[] numbers = new int[parts.length];
			for (int i = 0; i < parts.length; i++) {
				numbers[i] = Integer.parseInt(parts[i]); // Chuyển từ String sang int
			}
			for(int i = 0; i < parts.length; i++) {
				for(int j = i + 1; j < parts.length; j++) {
					if(numbers[i] > numbers[j]) {
						int k = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = k;
					}
				}
			}
			for(int i = 0; i < parts.length; i++) {
				System.out.print(numbers[i] + " ");
			}
			scanner.close();
		}
	}
