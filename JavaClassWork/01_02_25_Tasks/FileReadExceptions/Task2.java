import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) {
		String fileName = "/Users/Rodion Industries/Desktop/readme.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			int count = 0;
			while ((bufferedReader.readLine()) != null) {
				count += 1;
			}
			System.out.println(count);
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла с использованием BufferReader: " + e.getMessage());
		}
	}
}