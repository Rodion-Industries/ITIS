import java.util.Scanner;
public class Solution_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		// № 1
		// System.out.println("Введите оценку: ");
		// int k = sc.nextInt();
		// switch (k) {
		// 	case 1:
		// 		System.out.println("плохо");
		// 		break;
		// 	case 2:
		// 		System.out.println("неудовлетворительно");
		// 		break;
		// 	case 3:
		// 		System.out.println("удовлетворительно");
		// 		break;
		// 	case 4:
		// 		System.out.println("хорошо");
		// 		break;
		// 	case 5:
		// 		System.out.println("отлично");
		// 		break;
		// 	default:
		// 		System.out.println("Ошибка: оценка не лежит в диапазоне 1-5");
		// }


		// // № 2
		// System.out.println("Введите оценку: ");
		// int k = sc.nextInt();
		// if (5 <= k && k <= 11) {
		// 	System.out.println("доброе утро");
		// }
		// else if (12 <= k && k <= 15) {
		// 	System.out.println("добрый день");
		// }
		// else if (16 <= k && k <= 23) {
		// 	System.out.println("добрый вечер");
		// }
		// else if (k == 24 || (1 <= k && k <= 4)) {
		// 	System.out.println("доброй ночи");
		// }
		// else {
		// 	System.out.println("Ошибка");
		// }


		// // № 3
		// System.out.println("Введите число x: ");
		// int x = sc.nextInt();
		
		// System.out.println("Выберите действия: ");
		// System.out.println("1 - возвести число в квадрат");
		// System.out.println("2 - извлечь корень квадратный");
		// System.out.println("3 - вычислить синус");
		// System.out.println("4 - ввычислить косинус");
		// System.out.println("Ввод команды: ");

		// int command = sc.nextInt();

		// switch (command) {
		// 	case 1:
		// 		System.out.println(Math.pow(x, 2));
		// 		break;
		// 	case 2:
		// 		System.out.println(Math.sqrt(x));
		// 		break;
		// 	case 3:
		// 		System.out.println(Math.sin(x));
		// 		break;
		// 	case 4:
		// 		System.out.println(Math.cos(x));
		// 		break;
		// 	default:
		// 		System.out.println("Ошибка: вы не выбрали команду!");
		// 		break;
		// }


		// // № 4
		// System.out.println("Введите букву строчную букву англ. алф. : ");
		// String letter1 = sc.nextLine();
		// String letter2 = letter1.toUpperCase();
		// System.out.println(letter2);


		// // № 5
		// System.out.println("Введите номер месяца: ");
		// int month = sc.nextInt();
		// System.out.println("Осталось: "+(12-month)+" месяц(-ев)");


		// // № 6
		// System.out.println("Введите кол-во строк: ");
		// int lines = sc.nextInt();
		// System.out.println("Введите кол-во столбцов: ");
		// int columns = sc.nextInt();

		// for (int i = 0; i < lines; i++) {
		// 	for (int j = 0; j < columns; j++) {
		// 		System.out.print("1 ");
		// 	}
		// 	System.out.println();
		// }


		// // № 7
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// int z = sc.nextInt();

		// int x = a % b; 

		// if (x == 0) {
		// 	System.out.println("z = z*x = "+(z*x));
		// } else {
		// 	System.out.println("z = z/x = "+(z/x));
		// }


		// // № 8
		// System.out.println("Введите длину последовательности(большую или равную 3): ");
		// int n = sc.nextInt();

		// int[] arr = new int[n];

		// for (int i = 0; i<n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int count = 0;

		// for (int j = 1; j < (n-1); j++) {
		// 	if (arr[j-1] < arr[j] && arr[j] > arr[j+1]) {
		// 		if (arr[j] % 2 == 0) {
		// 			count += 1;
		// 		}
		// 	}
		// }

		// if (count >= 1) {
		// 	System.out.println("В данной послед-ти сущ-ет чётный по значению локальный максимум");
		// }


		// // № 9
		// System.out.println("Введите длину последовательности: ");
		// int n = sc.nextInt();

		// int count = 0;
		// int summ = 0;

		// for (int i = 0; i < n; i++) {
		// 	int num = sc.nextInt();
		// 	if (num % 5 == 0 && num % 7 != 0) {
		// 		count += 1;
		// 		summ += num;
		// 	}
		// }
		// System.out.println(count);
		// System.out.println(summ);


		// // № 10
		// System.out.println("Введите длину последовательности: ");
		// int n = sc.nextInt();

		// int summ = 0;

		// for (int i = 0; i < n; i++) {
		// 	int num= sc.nextInt();
		// 	if (num > 0) {
		// 		summ += num;
		// 	}
		// }
		// System.out.println(2*summ);


		// // № 11
		// System.out.println("Введите длину последовательности: ");
		// int n = sc.nextInt();

		// int multiplication = 1;

		// for (int i = 0; i < n; i++) {
		// 	int num = sc.nextInt();
		// 	if (num % 7 == 0) {
		// 		multiplication *= num;
		// 	}
		// }
		// System.out.println(multiplication);


		// // № 12
		// System.out.println("Введите дейтсвит. число: ");
		// int x = sc.nextInt();

		// // a)
		// if (-2 <= x && x < 2) {
		// 	System.out.println(x*x);
		// } else {
		// 	System.out.println(4);
		// }

		// //  б)
		// if (x <= 2) {
		// 	System.out.println(x*x + 4*x + 5);
		// } else {
		// 	System.out.println(1.0/(x*x + 4*x + 5));
		// }


		// // № 13
		// System.out.println("Введите действит. число a: ");
		// double a = sc.nextDouble();
		// System.out.println("Введите нат. число n: ");
		// int n = sc.nextInt();

		// // a)
		// System.out.println(Math.pow(a, n));

		// // б)
		// int mult = 1;
		// for (double i = a; i <= (a+n-1); i++) {
		// 	mult *= i;
		// } 
		// System.out.println(mult);

		// // в)
		// double summ = 0;
		// int multipl = 1;
		// for (double j = a; j <= (a+n); j++) {
			
		// 	double drob = 1.0;
			
		// 	multipl *= j;
		// 	drob /= multipl;

		// 	summ += drob;
		// }
		// System.out.println(summ);


		// // № 14
		// System.out.println("i<=n");
		// System.out.println("Введите нат. число i:");
		// int i = sc.nextInt();
		// System.out.println("Введите нат. число n:");
		// int n = sc.nextInt();
		
		// int summ = 0;

		// int[] arr = new int[n];
		// for (int j = 0; j < n; j++) {
		// 	arr[j] = sc.nextInt();
		// }

		// for (int k = 0; k < n; k++) {
		// 	if (k != i-1) {
		// 		summ += arr[k];
		// 	}
		// }
		// System.out.println(summ);


		// sc.close();









	}
}