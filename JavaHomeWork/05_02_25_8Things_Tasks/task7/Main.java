import java.io.*;
import java.util.regex.*;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("CapitalLetters.txt"))) {
			String line;
			String regex = "\\b[А-ЯA-Z][а-яёa-z]*\\b";
			// Pattern.UNICODE_CHARACTER_CLASS - эта запись нужня для чтения текста на Русском!
			Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
			while((line = reader.readLine()) != null) {
				Matcher matcher = pattern.matcher(line);

				// проверяем не ВСЮ строку, а то, что ВНУТРИ неё => find()
				while (matcher.find()) {
					// matcher.group() - находит фрагмент, который соответсвует регулярному выражению
					System.out.println(matcher.group());
				} 
			}


		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла: " + e.getMessage());
		}
	}
}