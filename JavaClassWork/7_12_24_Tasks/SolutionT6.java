import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT6 {

	// а)
	// public String answer(int[][] massive, int n, int len) {
	// 	int[] arr = new int[len];

	// 	int spr = 0;

	// 	for (int k = 0; k < len; k++) {
	// 		if (massive[k][n] % 2 == 0) {
	// 			spr = massive[k][n];
	// 			break;
	// 		}
	// 	}

	// 	if (spr == 0) {
	// 		for (int p1 = 0; p1 < len; p1++) {
	// 			arr[p1] = 0;
	// 		}
	// 	} else {
	// 		for (int p = 0; p < len; p++) {
	// 			arr[p] = spr;
	// 		}
	// 	}


	// 	String g = Arrays.toString(arr);
	// 	return g;


	// }



	// public static void main(String[] args) {
	// 	Random random = new Random();
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT6 sol = new SolutionT6();
	// 	System.out.println("Введите ранг матрицы: ");
	// 	int r = sc.nextInt();
	// 	System.out.println("Введите номер столбца: ");
	// 	int num = sc.nextInt() - 1;
	// 	int[][] matrix = new int[r][r];
	// 	for (int i = 0; i < r; i++) {
	// 		for (int j = 0; j < r; j++) {
	// 			matrix[i][j] = random.nextInt(1, 21);
	// 		}
	// 	}
	// 	System.out.println("Исходная матрица: ");
	// 	for (int x = 0; x < r; x++) {
	// 		for (int y = 0; y < r; y++) {
	// 			System.out.print(matrix[x][y]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();
	// 	System.out.println(sol.answer(matrix, num, r));
	// }












	// // б)
	// public String answer(int[][] massive, int n, int len) {
	// 	int[] arr = new int[len];

	// 	int spr = 0;

	// 	for (int k = 0; k < len; k++) {
	// 		if (massive[k][n] % 2 != 0) {
	// 			spr = massive[n][k];
	// 		}
	// 	}

	// 	if (spr == 0) {
	// 		for (int p1 = 0; p1 < len; p1++) {
	// 			arr[p1] = 0;
	// 		}
	// 	} else {
	// 		for (int p = 0; p < len; p++) {
	// 			arr[p] = spr;
	// 		}
	// 	}


	// 	String g = Arrays.toString(arr);
	// 	return g;


	// }



	// public static void main(String[] args) {
	// 	Random random = new Random();
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT6 sol = new SolutionT6();
	// 	System.out.println("Введите ранг матрицы: ");
	// 	int r = sc.nextInt();
	// 	System.out.println("Введите номер строки: ");
	// 	int num = sc.nextInt() - 1;
	// 	int[][] matrix = new int[r][r];
	// 	for (int i = 0; i < r; i++) {
	// 		for (int j = 0; j < r; j++) {
	// 			matrix[i][j] = random.nextInt(1, 21);
	// 		}
	// 	}
	// 	System.out.println("Исходная матрица: ");
	// 	for (int x = 0; x < r; x++) {
	// 		for (int y = 0; y < r; y++) {
	// 			System.out.print(matrix[x][y]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();
	// 	System.out.println(sol.answer(matrix, num, r));
	// }


}