import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите вещ. число: ");
		double multiplier;
		multiplier = sc.nextDouble();

		Vector2D vector1 = new Vector2D(5, 7);
		Vector2D vector2 = new Vector2D(2, 3);
		System.out.println("vector1 = " + vector1.toString());
		System.out.println("vector2 = " + vector2.toString());

		Vector2D vector3 = vector1.add(vector2);
		System.out.println("Сложение vector1 + vector2 = " + vector3);

		vector1.add2(vector2);
		System.out.println("Изменение vector1 = vector1 + vector2 = " + vector1);

		Vector2D vector4 = vector1.sub(vector2);
		System.out.println("Вычитание vector4 = vector1 - vector2 = " + vector4);

		vector1.sub2(vector2);
		System.out.println("Изменение vector1 = vector1 - vector2 = " + vector1);

		Vector2D vector5 = vector1.mult(multiplier);
		System.out.println("Умножение на вещ. число vector1 * multiplier = " + vector5);

		vector1.mult2(multiplier);
		System.out.println("Изменение vector1 = vector1 * multiplier = " + vector1);

		System.out.println(vector1.toString());

		System.out.println("Длина vector1 = " + vector1.length());
		System.out.println("Длина vector2 = " + vector2.length());

		System.out.println("Скалярное произведение vector1 * vector2 = " + vector1.scalarProduct(vector2));

		try {
			System.out.println("Косинус: " + vector1.cos(vector2));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Верно ли, что vector1 равен vector2: " + vector1.equals(vector2));
	}
}