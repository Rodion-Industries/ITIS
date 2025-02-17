import java.io.*;
import java.util.regex.*;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("OnlyNums.txt"))) {
			String line;
			String regex = "^\\d+$";
			Pattern pattern = Pattern.compile(regex);
			while((line = reader.readLine()) != null) {
				Matcher matcher = pattern.matcher(line);

				if (matcher.matches()) {
					System.out.println(matcher.group());
				} 
			}


		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла: " + e.getMessage());
		}
	}
}