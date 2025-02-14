import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String regex = "[+-]?\\d+[.,]?\\d+";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);
		// matcher.(find()-частичное совпадение в строке или matches()-проверяет всю строку)
		if (matcher.matches()) {
			System.out.println(input + " это и правда Вещественное число.");
		} else {
			System.out.println(input+" это НЕ вещественное число!");
		}

	}
}