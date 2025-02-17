import java.io.*;
import java.util.regex.*;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("DayMonthYear.txt"))) {
			String line;

			String regex = "(0[1-9]|1[0-9]|2[0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})";
			Pattern pattern = Pattern.compile(regex);

			int count = 0;

			while((line = reader.readLine()) != null) {
				count += 1;
	        	Matcher matcher = pattern.matcher(line);
	        	// matches - всю строку проверяет на совпадение (а у нас дата может быть внутри текста)
	        	// find - нужно использовать на первое попавшееся совпадение 
	        	if (matcher.find()) {
	        		System.out.println("Строка " + count + ": " + " содержит формат даты DD.MM.YYYY.");
	        	} else {
	        		System.out.println("Строка " + count + ": " + " НЕ содержит дат в нужном формате.");
	        	}
			}
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла!" + e.getMessage());
		}  
	}
}