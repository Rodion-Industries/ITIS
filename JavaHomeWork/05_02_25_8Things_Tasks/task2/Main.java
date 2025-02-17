// почему-то с РУССКИМ языком замена и ЗАПИСЬ НЕВОЗМОЖНА (...
// хотя, можно подключить кодировку UTF-8 и прописать -> 
// -> new InputStreamReader(new FileInputStream("имя_файлика.txt"), StandardCharsets.UTF_8) ->
// -> вместо FileReader() и FileWriter()
// import java.nio.charset.StandardCharsets;


import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово, которое вы хотите заменить: ");
		String lastWord = sc.nextLine();
		System.out.println("Введите новое слово: ");
		String newWord = sc.nextLine();
		try (
			BufferedReader reader = new BufferedReader(new FileReader("WordReplace.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("NewFile.txt"))
		) {
			// место для хранения текущей строки
			String line;
			while((line = reader.readLine()) != null) {
				// "\\b" - это четкие границы слова, чтобы заменить не его часть, а все целиком
				String newLine = line.replaceAll("\\b" + lastWord + "\\b", newWord);
				writer.write(newLine);
				writer.newLine();
			}

		} catch (IOException e) {
			System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
		}
	}
}