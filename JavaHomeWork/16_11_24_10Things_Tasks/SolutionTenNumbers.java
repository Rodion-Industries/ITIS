import java.util.Scanner;
public class SolutionTenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// // № 1
		// System.out.println("Введите число k в дапапзоне 2<k<9: ");
		// int k = sc.nextInt();
		// System.out.println("Введите число n: ");
		// int n = sc.nextInt();

		// String s = Integer.toString(n);
		// int len = s.length()-1;

		// int summ = 0;
		// int p = 0;
		// while (n != 0) {
		// 	summ += (n%10)*Math.pow(k, p);
		// 	p += 1;
		// 	n /= 10;
		// }
		// System.out.println(summ);


		// // № 2
		// System.out.println("Введите длину послед-ти (большую или равную 3): ");
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int count = 0;
		// for (int j = 1; j <= (n-2); j++) {
		// 	if (arr[j-1] < arr[j] && arr[j] > arr[j+1] && arr[j] % 2 == 0) {
		// 		count += 1;
		// 	}
		// }
		// if (count == 2) {
		// 	System.out.println("Во входной послед-ти сущ-ет ровно 2 чётных лок. максимума");
		// } else {
		// 	System.out.println("Во входной послед-ти сущ-ет ровно "+count+" чётных лок. максим.");
		// }


		// // № 3
		// double m = sc.nextInt();
		// double n = sc.nextInt();

		// double drob1 = m/n;
		// double drob2 = n/m;

		// double num1 = Math.PI - drob1;
		// double num2 = Math.PI - drob2;

		// if (num1 > num2) {
		// 	System.out.println("дробь m/n лежит ближе к числу PI");
		// }
		// else if (num1 < num2) {
		// 	System.out.println("дробь n/m лежит ближе к числу PI");
		// } else {
		// 	System.out.println("дробь m/n и n/m лежат на одинаковом рас-нии к числу PI");
		// }


		// № 4
		int n = sc.nextInt();

		int count3CHET = 0;
		int count3NECHET = 0;

		int count5CHET = 0;
		int count5NECHET = 0;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();

			int k = num;

			String str = Integer.toString(num);
			int len = str.length();

			int countCHET = 0;
			int countNECHET = 0;

			while (k != 0) {
				int c = k%10;
				if (c % 2 == 0) {
					countCHET += 1;
				} else {
					countNECHET += 1;
				}
				k /= 10;
			}
			if (countCHET == len && len == 3) {
				count3CHET += 1;
			}
			if (countNECHET == len && len == 3) {
				count3NECHET += 1;
			}
			if (countCHET == len && len == 5) {
				count5CHET += 1;
			}
			if (countNECHET == len && len == 5) {
				count5NECHET += 1;
			}

		}
		if ((count3CHET+count5CHET+count3NECHET+count5NECHET) == 2) {
			System.out.println("В послед-ти ровно 2 таких числа");
		}

































	}
}