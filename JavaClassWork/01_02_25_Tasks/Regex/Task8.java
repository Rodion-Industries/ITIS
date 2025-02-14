import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String regex = "^[a-zA-Z]+\\?$";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("соответствует рег. выраж.");
		} else {
			System.out.println("НЕ соответствует рег. выраж.");
		}
	}
}