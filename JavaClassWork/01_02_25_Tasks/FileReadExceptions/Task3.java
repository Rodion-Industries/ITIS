import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
	public static void main(String[] args) {
		String fileName = "/Users/Rodion Industries/Desktop/readme.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line;
			int count = 0;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println((count+1)+". "+line);
				count += 1;
			}
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла с использованием BufferReader: " + e.getMessage());
		}
	} 
}