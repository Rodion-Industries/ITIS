import java.io.*;
import java.util.regex.*;

public class Task3 {
    public static void main(String[] args) {
        // Указываем путь к файлу
        String fileName = "C:\\ITIS\\JavaHomeWork\\05_02_25_8Things_Tasks\\Num3\\Division.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Читаем строку из файла
            String line = reader.readLine();
            
            if (line == null) {
                throw new IOException("Файл пустой.");
            }

            // Ищем два числа в строке
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(line);
            
            int[] numbers = new int[2];
            int count = 0;

            while (matcher.find() && count < 2) {
                numbers[count++] = Integer.parseInt(matcher.group());
            }

            if (count < 2) {
                throw new IOException("Файл должен содержать хотя бы два числа.");
            }

            int result = numbers[0] / numbers[1];
            System.out.println("Результат: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Файл содержит некорректные числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
