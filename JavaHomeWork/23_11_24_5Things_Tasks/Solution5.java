import java.util.Scanner;
import java.util.Arrays;
public class Solution5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// // №1
		System.out.println("Введите 15 значений массива: ");
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = sc.nextInt();
		}

		// // а) 
		// for (int j = 2; j < 5; j++) {
		// 	int k1 = arr[j];
		// 	int k2 = arr[11-j];
		// 	arr[j] = k2;
		// 	arr[11-j] = k1;
		// }
		// System.out.println(Arrays.toString(arr));


		// б)
		// System.out.println("Введите k: ");
		// int k = sc.nextInt();
		// System.out.println("Введите s: ");
		// int s = sc.nextInt();
		
		
		// int c = (s-k-1)/2;
		// int s1 = k;
		// int p = s-2;
		// for (int a = k; a < (s1+c); a++) {
		// 	int k1 = arr[a];
		// 	int k2 = arr[p];
		// 	arr[a] = k2;
		// 	arr[p] = k1;
		// 	p -= 1;  
		// }
		// System.out.println(Arrays.toString(arr));


		// // в)
		// int k = 0, s = 0;
		// int start = 0, finish = 0;

		// int max = arr[0];
		// for (int q = 0; q < 15; q++) {
		// 	if (arr[q] > max) {
		// 		max = arr[q];
		// 	}
		// }

		// int min = arr[0];
		// for (int p = 0; p < 15; p++) {
		// 	if (arr[p] < min) {
		// 		min = arr[p];
		// 	}
		// }

		// for (int r = 0; r < 15; r++) {
		// 	if (arr[r] == min) {
		// 		k = r;
		// 	}
		// 	if (arr[r] == max) {
		// 		s = r;
		// 	}
		// }
		
		// if (k < s) {
		// 	start = k;
		// 	finish = s;
		// } else {
		// 	start = s;
		// 	finish = k;
		// }

		
		// int c = (finish-start+1)/2;
		// int s1 = start;
		// int p = finish;
		// for (int a = start; a < (s1+c); a++) {
		// 	int k1 = arr[a];
		// 	int k2 = arr[p];
		// 	arr[a] = k2;
		// 	arr[p] = k1;
		// 	p -= 1;  
		// }
		// System.out.println(Arrays.toString(arr));
		// System.out.println(start);
		// System.out.println(finish);



		// // №2
		// System.out.println("Введите размерность массива: ");
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }


		// int first_index_otric = 0;
		// int last_positive = 0;

		// for (int j = 0; j < n; j++) {
		// 	if (arr[j] < 0) {
		// 		first_index_otric = j;
		// 		break;
		// 	}
		// }

		// for (int p = 0; p < n; p++) {
		// 	if (arr[p] > 0) {
		// 		last_positive = p;
		// 	}
		// }

		// int k1 = arr[first_index_otric];
		// int k2 = arr[last_positive];

		// arr[first_index_otric] = k2;
		// arr[last_positive] = k1;

		
		// int count1 = 0;
		// int count2 = 0;
		// for (int m = 0; m < n; m++) {
		// 	if (arr[m] > 0) {
		// 		count1 += 1;
		// 	}
		// 	if (arr[m] < 0) {
		// 		count2 += 1;
		// 	}
		// }



		// if (count1 > 0 && count2 > 0) {
		// 	System.out.println(Arrays.toString(arr));
		// } else {
		// 	System.out.println("Должные быть и Отрицательные, и Положительные числа!");
		// }
		



		// // // №3
		// System.out.println("Введите длину послед-ти: ");
		// int n = sc.nextInt();
		// System.out.println("В одной строке введите элементы послед-ти через пробел: ");
		// int[] arr = new int[n];
		// for (int p = 0; p < n; p++) {
		// 	arr[p] = sc.nextInt();
		// }


		// // а)
		// for (int i = 0; i < n; i++) {
		// 	int count = 0;
		// 	for (int j = 0; j < n; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count == 1) {
		// 		System.out.println(arr[i]);
		// 	}
		// }


		// // б)
		// String s = "";
		// for (int i = 0; i < n; i++) {
		// 	int count = 0;
			
		// 	for (int j = 0; j < n; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count > 1 && !s.contains(Integer.toString(arr[i]))) {
		// 		System.out.println(arr[i]);
		// 		s += Integer.toString(arr[i]);
		// 	} else {
		// 		s += Integer.toString(arr[i]);
		// 	}
		// }


		// // в)
		// int coutOfNums = 0;

		// for (int i = 0; i < n; i++) {
		// 	int count = 0;
			
		// 	for (int j = 0; j < n; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count == 1) {
		// 		coutOfNums += 1;
		// 	} 
		// }
		// System.out.println(coutOfNums);


		// // г)
		// String s = "";
		// int coutOfNums = 0;

		// for (int i = 0; i < n; i++) {
		// 	int count = 0;
			
		// 	for (int j = 0; j < n; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count > 1 && !s.contains(Integer.toString(arr[i]))) {
		// 		coutOfNums += 1;
		// 		s += Integer.toString(arr[i]);
		// 	} else {
		// 		s += Integer.toString(arr[i]);
		// 	}
		// }
		// System.out.println(coutOfNums);


		// // е)
		// int answer = 0;
		// for (int i = 0; i < n; i++) {
		// 	int count = 0;
		// 	for (int j = 0; j < n; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count == 2) {
		// 		answer += 1;
		// 	}
		// }
		// if (answer > 0) {
		// 	System.out.println("В последовательности Есть пара(-ы) одинаковых чисел!");
		// } else {
		// 	System.out.println("В последовательности НЕТ пары(-ы) одинаковых чисел!");
		// }




		// // // №4
		// System.out.println("Введите кол-во строк матрицы: ");
		// int m = sc.nextInt();
		// System.out.println("Введите кол-во столбцов матрицы: ");
		// int n = sc.nextInt();
		// System.out.println("Ваша матрица размера "+m+"x"+n);
		// double[][] arr = new double[m][n];

		// for (int i = 0; i < m; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 	}
		// }

		// double summ = 0;

		// for (int a = 0; a < m; a++) {
		// 	double max = arr[a][0];
		// 	for (int b = 0; b < n; b++) {
		// 		if (max < arr[a][b]) {
		// 			max = arr[a][b];
		// 		}
		// 	}
		// 	summ += max;
		// }

		// System.out.println(summ);




		// // №5
		// System.out.println("Введите число n: ");
		// int n = sc.nextInt();

		// int count = 0;
		// int k = n;
		// while (k != 0) {
		// 	count += 1;
		// 	k /= 10;
		// }	

		// int[] arr = new int[count];
		// for (int i = 0; i < count; i++) {
		// 	arr[i] = n%10;
		// 	n /= 10;
		// }
		// System.out.println(Arrays.toString(arr));











	}
}