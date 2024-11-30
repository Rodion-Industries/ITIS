import java.util.Scanner;
import java.util.Arrays;
public class Solution30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// // №381
		// int[][] arr = new int[10][10];
		// for (int i = 0; i < 10; i++) {
		// 	for (int j = 0; j < 10; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }

		// int[] massive = new int[10];

		// for (int m = 0; m < 10; m++) {
		// 	int max = arr[m][0];
		// 	for (int n = 0; n < 10; n++) {
		// 		if (arr[m][n] > max) {
		// 			max = arr[m][n];
		// 		}
		// 	}
		// 	massive[m] = max;
		// }

		// for (int p = 0; p < 10; p++) {
		// 	for (int k = 0; k < 10; k++) {
		// 		if (arr[p][k] == massive[p]) {
		// 			arr[p][k] = 0;
		// 		}
		// 	}
		// }

		// System.out.println("Ваша измененная матрица 10х10: ");

		// for (int a = 0; a < 10; a++) {
		// 	for (int b = 0; b < 10; b++) {
		// 		System.out.print(arr[a][b]+" ");
		// 	}
		// 	System.out.println();
		// }




		// // №382
		// int[][] arr = new int[6][9];
		// for (int i = 0; i < 6; i++) {
		// 	for (int j = 0; j < 9; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }

		// int[] massive1 = new int[6];

		// for (int m = 0; m < 6; m++) {
		// 	int max = arr[m][0];
		// 	for (int n = 0; n < 9; n++) {
		// 		if (arr[m][n] > max) {
		// 			max = arr[m][n];
		// 		}
		// 	}
		// 	massive1[m] = max;
		// }

		// int[] massive2 = new int[6];
		// for (int p = 0; p < 6; p++) {
		// 	int min = arr[p][0];
		// 	for (int k = 0; k < 9; k++) {
		// 		if (arr[p][k] < min) {
		// 			min = arr[p][k];
		// 		}
		// 	}
		// 	massive2[p] = min;
		// }


		// int maxN = massive1[0];
		// for (int a = 0; a < 6; a++) {
		// 	if (maxN < massive1[a]) {
		// 		maxN = massive1[a];
		// 	}
		// }

		// int minN = massive2[0];
		// for (int b = 0; b < 6; b++) {
		// 	if (minN > massive2[b]) {
		// 		minN = massive2[b];
		// 	}
		// }

		// System.out.println(minN);
		// System.out.println(maxN);
		// System.out.println((minN+maxN)*1.0/2);




		// // №383
		// System.out.println("В вашей матрице 18 строк, введите кол-во столбцов n: ");
		// int n  = sc.nextInt();
		// System.out.println("Размер вашей матрицы: 18x"+n);
		// System.out.println("Введите в каждой строке элементы строк матрицы: ");
		// int[][] arr = new int[18][n];
		// for (int i = 0; i < 18; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }

		// int[] massive = new int[18];
		// for (int p = 0; p < 18; p++) {
		// 	int max = 0;
		// 	if (arr[p][0] < 0) {
		// 		max = arr[p][0] * -1;
		// 	} else {
		// 		max = arr[p][0];
		// 	}
			
		// 	for (int k = 0; k < n; k++) {
		// 		int rez = 0;
		// 		if (arr[p][k] < 0) {
		// 			rez = arr[p][k] * -1;
		// 		} else {
		// 			rez = arr[p][k];
		// 		}
		// 		if (max < rez) {
		// 			max = rez;
		// 		}
		// 	}
		// 	massive[p] = max;
		// }

		// int maxN = massive[0];
		// for (int a = 0; a < 18; a++) {
		// 	if (maxN < massive[a]) {
		// 		maxN = massive[a];
		// 	}
		// }

		// System.out.println("Самый большой по модулю элемент в матрице: "+maxN);

		// for (int x = 0; x < 18; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		if (maxN == arr[x][y] || maxN == -1*arr[x][y]) {
		// 			System.out.println((x+1)+" "+(y+1));
		// 		}
		// 	}
		// }




		// // №384
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



		// // №385
		// System.out.println("Введите ранг матрицы: ");
		// int n = sc.nextInt();
		// System.out.println("Ваша матрица размера "+n+"x"+n);
		// double[][] arr = new double[n][n];

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 	}
		// }

		// double[] massive = new double[n];

		// for (int a = 0; a < n; a++) {
		// 	double min = arr[a][0];
		// 	for (int b = 0; b < n; b++) {
		// 		if (min > arr[a][b]) {
		// 			min = arr[a][b];
		// 		}
		// 	}
		// 	massive[a] = min;
		// }

		// double minN = massive[0];
		// for (int x = 0; x < n; x++) {
		// 	if (minN > massive[x]) {
		// 		minN = massive[x];
		// 	}
		// }

		// int indexOfMin = 0;
		// for (int p = 0; p < n; p++) {
		// 	for (int k = 0; k < n; k++) {
		// 		if (arr[p][k] == minN) {
		// 			indexOfMin = p;
		// 		}
		// 	}
		// }

		// double summ = 0;
		// for (int c = 0; c < n; c++) {
		// 	summ += arr[indexOfMin][c];
		// }

		// System.out.println(summ);




		// // №387
		// System.out.println("Введите ранг матрицы: ");
		// int n = sc.nextInt();
		// System.out.println("Ваша матрица размера "+n+"x"+n);
		// double[][] arr = new double[n][n];

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 	}
		// }

		// System.out.println("Введите элементы послед-ти длины n+5: ");
		// double[] array = new double[n+5];
		// for (int q = 0; q < (n+5); q++) {
		// 	array[q] = sc.nextDouble();
		// }
		// System.out.println(Arrays.toString(array));
		// double[] massive = new double[n];

		// for (int a = 0; a < n; a++) {
		// 	double max = arr[a][0];
		// 	for (int b = 0; b < n; b++) {
		// 		if (max < arr[a][b]) {
		// 			max = arr[a][b];
		// 		}
		// 	}
		// 	massive[a] = max;
		// }

		// double maxN = massive[0];
		// for (int x = 0; x < n; x++) {
		// 	if (maxN < massive[x]) {
		// 		maxN = massive[x];
		// 	}
		// }

		// boolean flag = false;
		// for (int p = 0; p < n; p++) {
		// 	for (int k = 0; k < n; k++) {
		// 		if (arr[p][k] == maxN && p == k) {
		// 			flag = true;
		// 		}
		// 	}
		// }


		// if (flag) {
		// 	System.out.println("Маскимальный элемент матрицы находится на ГЛАВНОЙ даигонали");
		// 	for (int r = 0; r < n+5; r++) {
		// 		array[r] *= 10;
		// 	}
		// } else {
		// 	System.out.println("Маскимальный элемент матрицы находится на ПОБОЧНОЙ даигонали");
		// 	for (int g = 0; g < n+5; g++) {
		// 		array[g] *= 0.5;
		// 	}
		// }

		// System.out.println(Arrays.toString(array));



		// // №388
		// System.out.println("Введите Ранг матрицы: ");
		// int n = sc.nextInt();
		// System.out.println("Ваша матрица размера "+n+"x"+n);
		// double[][] arr = new double[n][n];

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 	}
		// }

		// double[] massive = new double[n];

		// for (int a = 0; a < n; a++) {
		// 	double max = arr[a][0];
		// 	for (int b = 0; b < n; b++) {
		// 		if (max < arr[a][b]) {
		// 			max = arr[a][b];
		// 		}
		// 	}
		// 	massive[a] = max;
		// }

		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++)	{
		// 		if (massive[x] == arr[x][y]) {
		// 			System.out.println((x+1)+" "+(y+1));
		// 		}
		// 	}
		// }
		



		// // №389
		// System.out.println("Введите кол-во строк матрицы, n: ");
		// int n = sc.nextInt();
		// System.out.println("Введите кол-во столбцов матрицы, m: ");
		// int m = sc.nextInt();
		// System.out.println("Ваша матрица размера "+n+"x"+m);
		// double[][] arr = new double[n][m];

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		arr[i][j] = sc.nextDouble();
		// 	}
		// }

		// double[] massive = new double[n];

		// for (int a = 0; a < n; a++) {
		// 	double min = arr[a][0];
		// 	for (int b = 0; b < m; b++) {
		// 		if (min > arr[a][b]) {
		// 			min = arr[a][b];
		// 		}
		// 	}
		// 	massive[a] = min;
		// }

		// double maxN = massive[0];
		// for (int x = 0; x < n; x++) {
		// 	if (maxN < massive[x]) {
		// 		maxN = massive[x];
		// 	}
		// }

		// for (int p = 0; p < n; p++) {
		// 	for (int k = 0; k < m; k++) {
		// 		if (maxN == arr[p][k]) {
		// 			System.out.println((p+1)+" "+(k+1));
		// 		}
		// 	}
		// }

		// System.out.println(Arrays.toString(massive));
		// System.out.println(maxN);




		// №392
		System.out.println("Введите ранг матрицы, n: ");
		int n = sc.nextInt();
		System.out.println("Ваша матрица размера "+n+"x"+n);
		double[][] arr = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}


		double[] massive = new double[n];
		for (int a = 0; a < n; a++) {
			double summ = 0;
			for (int b = 0; b < n; b++) {
				summ += Math.abs(arr[b][a]);
			}
			massive[a] = summ;
		}

		System.out.println(Arrays.toString(massive));


		double maxim = massive[0];
		for (int f = 0; f < n; f++) {
			if (maxim < massive[f]) {
				maxim = massive[f];
			}
		}
		System.out.println("Max sum of stolb = "+maxim);


		int stolb = 0;
		for (int k = 0; k < n; k++) {
			double summ1 = 0;
			for (int p = 0; p < n; p++) {
				summ1 += Math.abs(arr[p][k]);
			}
			if (summ1 == maxim) {
				stolb = k;
			}
		}
		System.out.println("stolb = "+(stolb+1));



		double[] array = new double[n];
		for (int g = 0; g < n; g++) {
			array[g] = arr[g][stolb];
		}

		System.out.println(Arrays.toString(array));




		double minim = array[0];
		for (int l = 0; l < n; l++) {
			if (array[l] < minim) {
				minim = array[l];
			}
		}

		System.out.println("ANSWER = "+minim);
















	}
}