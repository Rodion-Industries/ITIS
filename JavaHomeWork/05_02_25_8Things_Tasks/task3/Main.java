import java.io.*;
import java.util.regex.*;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("twoNumbers.txt"))) {
			String line = reader.readLine();
            
            if (line == null) {
				throw new IOException("К сожалению, файл пустой!");
			}

			Pattern pattern = Pattern.compile("^\\d+\\s+\\d+$");
            Matcher matcher = pattern.matcher(line);

            // matches() проверяет, соответствует ли вся строка регулярному выражению
			// а find() находит первое соответствие шаблону в строке
			if (!matcher.matches()) {
				throw new IOException("Строка не соответсвует формату: число пробел число!");
			} 
			
			String[] arr = line.split("\\s+");
				
			double a = Double.parseDouble(arr[0]);
			double b = Double.parseDouble(arr[1]);

			// Java сама выбросит ArithmeticException, если b = 0 (деление на ноль)
			double rez = a / b;

			// для красоты округлим результат до 3 знаков после запятой с помощью String.foramt()
			System.out.println("Результат деления " + a + " / " + b + " = " + String.format("%.3f", rez));
			
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Ошибка: деление на ноль! " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Ошибка: неверный формат числа! " + e.getMessage());
		}
	}

	// немного информации (ДЛЯ СЕБЯ):
	// IOException - проверяет только 1) наличие файла (существует ли он вообще), 2) возможно ли его открыть, 3) ошибка чтения/записи файла
	// ArithmeticException - проверяет только 1) деление на ноль
	// NumberFormatException - проверяет только 1) Неправильный формат строки для преобразования в число, 2) Пустая строка при преобразовании в число, 3) Не корректные числа с плавающей запятой (пример 12,3 - в джава нужна точка) 

}