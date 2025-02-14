import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Какое слово хотите заменить: ");
		String word1 = sc.nextLine();
		System.out.println("На какое слово хотите заменить: ");
		String word2 = sc.nextLine();
		String fileName1 = "C:\\ITIS\\JavaHomeWork\\05_02_25_8Things_Tasks\\Num2\\First.txt";
		String fileName2 = "C:\\ITIS\\JavaHomeWork\\05_02_25_8Things_Tasks\\Num2\\Second.txt";
		try (
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))
		) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("\\b" + word1 + "\\b", word2);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
			}
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла с использованием BufferReader: " + e.getMessage());
		}

	}
}