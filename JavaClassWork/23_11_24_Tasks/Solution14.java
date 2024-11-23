import java.util.Scanner;
import java.util.Arrays;
public class Solution14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// № 1
		// // а)
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int max = arr[0];
		// for (int j = 0; j < arr.length; j++) {
		// 	if (arr[j] > max) {
		// 		max = arr[j];
		// 	}
		// }
		
		// int index = 0;
		// for (int k = 0; k < arr.length; k++) {
		// 	if (max == arr[k] && k > index) {
		// 		index = k;
		// 	}
		// }

		// System.out.println(index+1);


		// // б)
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int[] arr_reverse = new int[n];
		// for (int k = 0; k < n; k++) {
		// 	arr_reverse[k] = arr[n-1-k];
		// }

		// int min = arr_reverse[0];
		// for (int j = 0; j < arr_reverse.length; j++) {
		// 	if (arr_reverse[j] < min) {
		// 		min = arr_reverse[j];
		// 	}
		// }

		// int index = 0;
		// for (int k = 0; k < arr_reverse.length; k++) {
		// 	if (min == arr_reverse[k] && index < k) {
		// 		index = k;
		// 	}
		// }

		// System.out.println(index+1);




		// № 2
		// // a)
		// int n = sc.nextInt();
		// int[] arr = new int[2*n];
		// for (int i = 0; i < 2*n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int summ = 0;
		// for (int j = 0; j < arr.length; j+=2) {
		// 	if (summ < (arr[j]+arr[j+1])) {
		// 		summ = arr[j]+arr[j+1];
		// 	}
		// }

		// System.out.println(summ);


		// // b)
		// int n = sc.nextInt();
		// int[] arr = new int[2*n];
		// for (int i = 0; i < 2*n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int mult = arr[0]*arr[1];
		// for (int j = 0; j < arr.length; j+=2) {
		// 	if (mult >= (arr[j]*arr[j+1])) {
		// 		mult = arr[j]*arr[j+1];
		// 	}
		// }

		// System.out.println(mult);




		// № 3
		// // a)
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int summ = arr[0] + arr[1];

		// for (int j = 0; j < arr.length-1; j++) {
		// 	if (summ < (arr[j]+arr[j+1])) {
		// 		summ = arr[j]+arr[j+1];
		// 	}
		// }

		// System.out.println(summ);


		// // b)
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int summ = arr[0] + arr[1];

		// for (int j = 0; j < arr.length-1; j++) {
		// 	if (summ > (arr[j]+arr[j+1])) {
		// 		summ = arr[j]+arr[j+1];
		// 	}
		// }

		// System.out.println(summ);


		// // в)
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int summ = arr[0] + arr[1];

		// for (int j = 0; j < arr.length-1; j++) {
		// 	if (summ < (arr[j]+arr[j+1])) {
		// 		summ = arr[j]+arr[j+1];
		// 	}
		// }

		// int firstIndex = 0;
		// int secondIndex = 0;
		// for (int k = 0; k < arr.length-1; k++) {
		// 	if (arr[k]+arr[k+1] == summ) {
		// 		firstIndex = k;
		// 		secondIndex = k+1;
		// 		break;
		// 	}
		// }

		// System.out.println((firstIndex+1)+" "+(secondIndex+1));


		// // г)
		// int n = sc.nextInt();

		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// int summ = arr[0] + arr[1];

		// for (int j = 0; j < arr.length-1; j++) {
		// 	if (summ > (arr[j]+arr[j+1])) {
		// 		summ = arr[j]+arr[j+1];
		// 	}
		// }


		// int firsIndex = 0;
		// int secondIndex = 0;
		// for (int k = 0; k < arr.length-1; k++) {
		// 	if (summ == (arr[k]+arr[k+1])) {
		// 		firsIndex = k;
		// 		secondIndex = k+1;
		// 	}
		// }

		// System.out.println((firsIndex+1)+" "+(secondIndex+1));



		// // № 4
		// int summ = 0;
		// int n = sc.nextInt();
		// if (n > 0 && n % 2 == 0) {
		// 	summ += n;
		// }
		// while (n != 0) {
		// 	n = sc.nextInt();
		// 	if (n > 0 && n % 2 == 0) {
		// 		summ += n;
		// 	}
		// }

		// if (summ == 0) {
		// 	System.out.println(0);
		// } else {
		// 	System.out.println(summ);
		// }




		// // № 5
		// int k = sc.nextInt();

		// int n = sc.nextInt();
		// if (n > k) {
		// 	System.out.println(n);
		// } else {
		// 	while (n != 0) {
		// 		n = sc.nextInt();
		// 		if (n > k) {
		// 			System.out.println(n);
		// 			break;
		// 		}
		// 	}
		// }


		// № 6
		// // а)
		// int a = sc.nextInt();
		// int p = sc.nextInt();

		// int[] arr = new int[10];
		// arr[0] = a;
		// for (int i = 1; i < 10; i++) {
		// 	arr[i] = a+p;
		// 	a = a+p;
		// }

		// System.out.println(Arrays.toString(arr));


		// // б)
		// int[] arr = new int[20];
		// arr[0] = 1;
		// arr[1] = 1;

		// for (int i = 2; i < 20; i++) {
		// 	arr[i] = (arr[i-1]+arr[i-2]);
		// }

		// System.out.println(Arrays.toString(arr));



		// // № 7
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// // а)
		// int summ = 0;
		// for (int j = 0; j < arr.length; j++) {
		// 	summ += arr[j];
		// }
		// System.out.println(summ);

		// // б)
		// int mult = 1;
		// for (int i = 0; i < arr.length; i++) {
		// 	mult *= arr[i];
		// }
		// System.out.println(mult);

		// // в)
		// int summ = 0;
		// for (int i = 0; i < arr.length; i++) {
		// 	summ += Math.pow(arr[i], 2);
		// }
		// System.out.println(summ);

		// // г)
		// int summ = 0;
		// for (int i = 0; i < 6; i++) {
		// 	summ += arr[i];
		// }
		// System.out.println(summ);

		// // д)
		// int k1 = sc.nextInt();
		// int k2 = sc.nextInt();

		// int summ = 0;

		// for (int i = k1-1; i < k2; i++) {
		// 	summ += arr[i];
		// }
		// System.out.println(summ);

		// // е)
		// int count = arr.length;
		// int summ = 0;
		// for (int j = 0; j < arr.length; j++) {
		// 	summ += arr[j];
		// }
		// System.out.println(summ*1.0/count);

		// // ж)
		// int s1 = sc.nextInt();
		// int s2 = sc.nextInt();
		// int count = s2-s1+1;

		// int summ = 0;

		// for (int i = s1-1; i < s2; i++) {
		// 	summ += arr[i];
		// }
		// System.out.println(summ);
		// System.out.println(count);
		// System.out.println(summ*1.0/count);




		// // № 8
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// // а)
		// int max = arr[0];
		// for (int j = 0; j < arr.length; j++) {
		// 	if (max < arr[j]) {
		// 		max = arr[j];
		// 	}	
		// }
		// System.out.println("Первый максимальный элемент: "+max);

		// int max2 = arr[0];
		// for (int k = 0; k < arr.length; k++) {
		// 	if (arr[k] != max && max2 < arr[k]) {
		// 		max2 = arr[k];
		// 	}
		// }
		// System.out.println("Второй максимальный элемент: "+max2);

		// // б)
		// int min = arr[0];
		// int max = arr[0];

		// for (int k = 0; k < arr.length; k++) {
		// 	if (max < arr[k]) {
		// 		max = arr[k];
		// 	}
		// }
		// System.out.println("Max: "+max);

		// for (int p = 0; p < arr.length; p++) {
		// 	if (min > arr[p]) {
		// 		min = arr[p];
		// 	}
		// }
		// System.out.println("Min: "+min);


		// // в)
		// int min = arr[0];
		// for (int j = 0; j < arr.length; j++) {
		// 	if (min > arr[j]) {
		// 		min = arr[j];
		// 	}	
		// }
		// System.out.println("Первый минимальный элемент: "+min);

		// int min2 = arr[0];
		// for (int k = 0; k < arr.length; k++) {
		// 	if (arr[k] != min && min2 > arr[k]) {
		// 		min2 = arr[k];
		// 	}
		// }
		// System.out.println("Второй минимальный элемент: "+min2);


		// // № 9
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		
		// for (int j = 0; j < n-1; j++) {
		// 	if (arr[j+1] < arr[j]) {
		// 		int k1 = arr[j];
		// 		int k2 = arr[j+1];
		// 		arr[j] = k2;
		// 		arr[j+1] = k1;
		// 	}
		// }

		// System.out.println(Arrays.toString(arr));
		// System.out.println(arr[n-1]);


		// // № 10
		// int len = sc.nextInt();
		// int[] arr = new int[len];
		// for (int i = 0; i < len; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// // а)
		// int k2 = arr[1];
		// int k5 = arr[4];
		// arr[1] = k5;
		// arr[4] = k2;

		// System.out.println(Arrays.toString(arr));

		// // б)
		// int m = sc.nextInt();
		// int n = sc.nextInt();
		// int km = arr[m-1];
		// int kn = arr[n-1];
		// arr[m-1] = kn;
		// arr[n-1] = km;
		// System.out.println(Arrays.toString(arr));

		// // в)
		// int max = arr[0];
		// for (int j = 0; j < len; j++) {
		// 	if (max < arr[j]) {
		// 		max = arr[j];
		// 	}
		// }

		// int index_max = 0;
		// for (int p = 0; p < len; p++) {
		// 	if (arr[p] == max) {
		// 		index_max = p;
		// 		break;
		// 	}
		// }

		// int k3 = arr[2];
		// int maxp = arr[index_max];
		// arr[2] = maxp;
		// arr[index_max] = k3;
		// System.out.println(Arrays.toString(arr));

		// // г)
		// int min = arr[0];
		// for (int j = 0; j < len; j++) {
		// 	if (min > arr[j]) {
		// 		min = arr[j];
		// 	}
		// }

		// int index_min = 0;
		// for (int p = 0; p < len; p++) {
		// 	if (arr[p] == min) {
		// 		index_min = p;
		// 	}
		// }

		// int k1 = arr[0];
		// int minp = arr[index_min];
		// arr[0] = minp;
		// arr[index_min] = k1;
		// System.out.println(Arrays.toString(arr));


		// № 11
		// а)
		// int n = sc.nextInt();
		// int m = 9;

		// int summ = 0;

		// int[][] arr = new int[n][m];

		// System.out.println("Введите в каждой из n строк по 9 элементов: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 		summ += arr[i][j];
		// 	}
		// }

		// System.out.println(summ);
		// System.out.println(count);
		// System.out.println(summ*1.0/9);

		// // б)
		// int n = sc.nextInt();
		// int m = 9;

		// int summ = 0;

		// int[][] arr = new int[n][m];

		// System.out.println("Введите в каждой из n строк по 9 элементов: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }

		// for (int k = 0; k < n; k++) {
		// 	for (int p = 1; p < 9; p+=2) {
		// 		summ += arr[k][p];
		// 	}
		// }

		// System.out.println(summ);
		// System.out.println(summ*1.0/4);


		// // № 12
		// System.out.println("Введите кол-во строк: ");
		// int n = sc.nextInt();
		// System.out.println("Введите кол-во столбцов: ");
		// int m = sc.nextInt();
		// System.out.println("Ваша матрица "+n+"x"+m+": ");



		// double[][] arr = new double[n][m];
		// double max = -99999;
		// System.out.println("Введите в каждой из n строк по m элементов: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 		if (arr[i][j] < 0) {
		// 			if (max < (arr[i][j]*-1.0)) {
		// 				max = arr[i][j]*-1.0;
		// 			}
		// 		} else {
		// 			if (max < arr[i][j]) {
		// 				max = arr[i][j];
		// 			}
		// 		}
		// 	}
		// }

		// System.out.println("Max: "+max);

		// System.out.println("Ваша преобразованная матрица: ");
		// for (int a = 0; a < n; a++) {
		// 	for (int b = 0; b < m; b++) {
		// 		System.out.print(arr[a][b] / max+" ");
		// 	}
		// 	System.out.println();
		// }


		// // № 13
		// System.out.println("Введите кол-во строк: ");
		// int n = sc.nextInt();
		// System.out.println("Введите кол-во столбцов: ");
		// int m = sc.nextInt();
		// System.out.println("Ваша матрица "+n+"x"+m+": ");



		// double[][] arr = new double[n][m];
		// double max = -99999;
		// double min = 99999;
		// System.out.println("Введите в каждой из n строк по m элементов: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 		if (arr[i][j] > max) {
		// 			max = arr[i][j];
		// 		}
		// 		if (arr[i][j] < min) {
		// 			min = arr[i][j];
		// 		}
		// 	}
		// }

		// System.out.println("Max: "+max);
		// System.out.println("Min: "+min);

		// System.out.println((max+min)*1.0/2);

		
		// № 14
		System.out.println("кол-во строк: 15");
		int n = 2;
		System.out.println("кол-во столбцов: 15");
		int m = 2;

		// а)
		double[][] arr = new double[n][m];
		System.out.println("Введите в каждой из 15 строк по 15 элементов: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}

		int count = 0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < m; b++) {
				if (count != 1) {
					if (arr[a][b] != 0) {
						System.out.println("["+(a+1)+"] ["+(b+1)+"]");
						count += 1;
					}
				} else {
					break;
				}
				
			}
		}


		// б)
		// double[][] arr = new double[n][m];
		// System.out.println("Введите в каждой из 15 строк по 15 элементов: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 	}
		// }


		// for (int a = 0; a < n; a++) {
		// 	for (int b = 0; b < m; b++) {
		// 		if (arr[a][b] != 0) {
		// 			System.out.println("["+(a+1)+"] ["+(b+1)+"]");
		// 		}
		// 	}
		// 	System.out.println();
		// }







		





























	}
}