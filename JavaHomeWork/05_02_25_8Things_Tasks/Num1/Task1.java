import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		String fileName = "C:\\ITIS\\JavaHomeWork\\05_02_25_8Things_Tasks\\Num1\\WordsCount.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line;
			int count = 0;
			while ((line = bufferedReader.readLine()) != null) {
				String words[] = line.trim().replaceAll("[.,!?;:\"()]", "").split("\\s+");
				count += words.length;
				// System.out.println(Arrays.toString(words));
			}
			System.out.println(count);
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла с использованием BufferReader: " + e.getMessage());
		}

	}
}