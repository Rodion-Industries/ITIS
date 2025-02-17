// импортируем все классы из пакета java.io такие, как BufferedReader, FileReade, FileWriter, PrintWriter, IOException 
// BufferedReader — класс для чтения текста из входного потока. (Буферизация означает, что данные читаются не по одному символу, а блоками)
// FileReader — класс для чтения символов из файла.
// FileWriter — класс для записи символов в файл.
// PrintWriter — класс для записи текста в поток вывода.
// IOException — класс для обработки ошибок ввода-вывода.
import java.io.*;
public class Main {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("WordsCounter.txt"))) {
			int count = 0;
			String line;
			System.out.println("А вот ваш текст: ");
			while((line = reader.readLine()) != null) {
				// хорошо бы сначала почистить строку от лишних символов таких как ,().;\></?*^%@&$ и т.д.
				// шаблон [^a-zA-Zа-яА-ЯёЁ0-9\\s] означает: Удалить всё, что НЕ является буквой, цифрой или пробелом
				String newLine = line.replaceAll("[^a-zA-Zа-яА-ЯёЁ0-9\\s]", "");
				// разбиваем строку по пробелам на массив слов
				String[] words = newLine.split("\\s+");
				count += words.length;
				System.out.println(line);
			}
			System.out.println();
			System.out.println("Кол-во слов в файле: " + count);
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла: " + e.getMessage());
		}
	}
}