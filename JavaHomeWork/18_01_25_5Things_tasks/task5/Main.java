import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		// Статические методы вызываются через имя класса, а не через объект!

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину массива: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Введите элементы массива: ");
		for (int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}
		System.out.println();

		System.out.println("Ваш массив: " + Arrays.toString(arr));
		System.out.println();

		int summ = ArrayUtils.getSum(arr);
		System.out.println("Метод getSum: " + summ);
		System.out.println();

		double sr = ArrayUtils.average(arr);
		System.out.println("Метод average: " + sr);
		System.out.println();

		int maxim = ArrayUtils.max_value(arr);
		System.out.println("Метод max_value: " + maxim);
		System.out.println();

		int minim = ArrayUtils.min_value(arr);
		System.out.println("Метод min_value: " + minim);
		System.out.println();

		int num = ArrayUtils.mode(arr);
		System.out.println("Метод mode: " + num);
		System.out.println();

		int[] massive = ArrayUtils.sort_ascending(arr);
		System.out.println("Метод sort_ascending: " + Arrays.toString(massive));
		System.out.println();



	}
}