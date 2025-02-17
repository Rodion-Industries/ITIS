import java.io.*;
public class Main {
	public static void main(String[] args) {
		String nameFile = "text.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
			String line;
			boolean isFileEmpty = true;
			while((line = reader.readLine()) != null) {
				if (!line.isEmpty()) {
					isFileEmpty = false;
					break;
				}
			}

			if (isFileEmpty) {
				throw new EmptyFileException("Файл пустой!");
			}

			reader.close();

			try (BufferedReader newReader = new BufferedReader(new FileReader(nameFile))) {
				int numOfString = 0;
                while ((line = newReader.readLine()) != null) {
                    numOfString++; // счётчик строк
                    try {
                        // Пробуем преобразовать строку в число
                        int number = Integer.parseInt(line);
                        System.out.println("Строка " + numOfString + ": " + number + " является числом)");
                    } catch (NumberFormatException e) {
                        System.out.println("Строка " + numOfString + ": не может быть преобразована в число.");
                    }
                }
			}
		} catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        }
	}
}