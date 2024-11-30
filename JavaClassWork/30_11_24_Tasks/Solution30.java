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




		// №383
		System.out.println("В ваше матрице 18 строк, введите кол-во столбцов n: ");
		int n  = sc.nextInt();
		System.out.printl("Размер вашей матрицы: 18x"+n);
		System.out.println("Введите в каждой строке элементы строк матрицы: ");
		int[][] arr = new int[18][n];
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < n, j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[] massive = new int[18];
		for (int p = 0, p < 18, p++) {
			if (arr[p][0] < 0) {
				int max = arr[p][0] * -1;
			} else {
				int max = arr[p][0];
			}
			
			for (int k = 0; k < n; k++) {
				if (arr[p][k] < 0) {
					int rez = arr[p][k] * -1;
				} else {
					int rez = arr[p][k];
				}
				if (max < rez) {
					max = rez
				}
			}
			massive[p] = max;
		}

		int maxN = massive[0];
		for (int a = 0; a < 18; a ++) {
			if (maxN < massive[a]) {
				maxN = massive[a];
			}
		}

		System.out.println("Самый большой по модулю элемент в матрице: "+maxN);

		for (int x = 0; x < 18; x++) {
			for (int y = 0; y < n; y++) {
				if (maxN == arr[x][y] || maxN == -1*arr[x][y]) {
					System.out.println(x+" "+y);
					break;
				}
			}
		}
































	}
}