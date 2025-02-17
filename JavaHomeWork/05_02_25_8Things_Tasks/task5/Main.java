import java.io.*;
import java.util.regex.*;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("PhoneNumbers.txt"))) {
			String line;

			String regex = "^\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}$";
			Pattern pattern = Pattern.compile(regex);

			int count = 0;

			while((line = reader.readLine()) != null) {
				count += 1;
	        	Matcher matcher = pattern.matcher(line);
	        	if (matcher.matches()) {
	        		System.out.println("Строка " + count + ": " + line + " - является номером телефона.");
	        	} else {
	        		System.out.println("Строка " + count + ": " + " НЕ является номером телефона.");
	        	}
			}
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла!" + e.getMessage());
		}





		
        
	}
}