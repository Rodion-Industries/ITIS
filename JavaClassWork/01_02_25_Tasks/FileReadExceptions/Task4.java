import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.toLowerCase();
		String fileName = "/Users/Rodion Industries/Desktop/readme.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line;
			int count = 0;
			while ((line = bufferedReader.readLine()) != null) {
				String newString = line.toLowerCase();
				if (newString.contains(word)) {
					count += 1;
				}
			}
			System.out.println("Кол-во вхождений слова " + word + " = " + count);
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла с использованием BufferReader: " + e.getMessage());
		}
	}
}