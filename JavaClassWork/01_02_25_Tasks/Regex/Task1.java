import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task1 {
	public static void main(String[] args) {
		String regex = ".*\\d.*";
        Pattern pattern = Pattern.compile(regex);

        String[] testStrings = {
                "Hello World",
                "Hello World 123",
                "Java is great!"
        };

        for (String testString: testStrings) {
            Matcher matcher = pattern.matcher(testString);
            if (matcher.find()) {
                System.out.printf("%s содержит хотя бы одну цифру\n", testString);
            } else {
                System.out.printf("%s не содержит цифр\n", testString);
            }
        }
	}
}