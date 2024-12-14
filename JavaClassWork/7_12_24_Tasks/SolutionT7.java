import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT7 {
	// // а)
	// public int[][] answer(int[][] massive1, int[][] massive2, int len) {
	// 	int[][] rez = new int[len][len];

	// 	for (int a = 0; a < len; a++) {
	// 		for (int b = 0; b < len; b++) {
	// 			rez[a][b] = massive1[a][b]+massive2[a][b];
	// 		}
	// 	}

		
	// 	return rez;
	// }



	// public static void main(String[] args) {
	// 	Random random = new Random();
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT7 sol = new SolutionT7();
	// 	System.out.println("Введите ранг матрицы: ");
	// 	int r = sc.nextInt();
		

	// 	int[][] matrix1 = new int[r][r];
	// 	for (int i = 0; i < r; i++) {
	// 		for (int j = 0; j < r; j++) {
	// 			matrix1[i][j] = random.nextInt(1, 21);
	// 		}
	// 	}
	// 	System.out.println("Исходная 1-я матрица: ");
	// 	for (int x = 0; x < r; x++) {
	// 		for (int y = 0; y < r; y++) {
	// 			System.out.print(matrix1[x][y]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


	// 	int[][] matrix2 = new int[r][r];
	// 	for (int i1 = 0; i1 < r; i1++) {
	// 		for (int j1 = 0; j1 < r; j1++) {
	// 			matrix2[i1][j1] = random.nextInt(1, 21);
	// 		}
	// 	}
	// 	System.out.println("Исходная 2-я матрица: ");
	// 	for (int x1 = 0; x1 < r; x1++) {
	// 		for (int y1 = 0; y1 < r; y1++) {
	// 			System.out.print(matrix2[x1][y1]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


	// 	int[][] N = sol.answer(matrix1, matrix2, r);
	// 	for (int k = 0; k < r; k++) {
	// 		for (int p = 0; p < r; p++) {
	// 			System.out.print(N[k][p]+" ");
	// 		}
	// 		System.out.println();
	// 	}



	// }


	// // б)
	// public int[][] answer(int[][] massive1, int[][] massive2, int len) {
	// 	int[][] rez = new int[len][len];

	// 	for (int a = 0; a < len; a++) {
	// 		for (int b = 0; b < len; b++) {
	// 			if (massive1[a][b] < 0 && massive2[a][b] < 0) {
	// 				rez[a][b] = 100;
	// 			} 
	// 			else if (massive1[a][b] > 0 && massive2[a][b] > 0) {
	// 				rez[a][b] = 100;
	// 			} 
	// 			else {
	// 				rez[a][b] = 0;
	// 			}
	// 		}
	// 	}

		
	// 	return rez;
	// }



	// public static void main(String[] args) {
	// 	Random random = new Random();
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT7 sol = new SolutionT7();
	// 	System.out.println("Введите ранг матрицы: ");
	// 	int r = sc.nextInt();
		

	// 	int[][] matrix1 = new int[r][r];
	// 	for (int i = 0; i < r; i++) {
	// 		for (int j = 0; j < r; j++) {
	// 			matrix1[i][j] = random.nextInt(-20, 21);
	// 		}
	// 	}
	// 	System.out.println("Исходная 1-я матрица: ");
	// 	for (int x = 0; x < r; x++) {
	// 		for (int y = 0; y < r; y++) {
	// 			System.out.print(matrix1[x][y]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


	// 	int[][] matrix2 = new int[r][r];
	// 	for (int i1 = 0; i1 < r; i1++) {
	// 		for (int j1 = 0; j1 < r; j1++) {
	// 			matrix2[i1][j1] = random.nextInt(-20, 21);
	// 		}
	// 	}
	// 	System.out.println("Исходная 2-я матрица: ");
	// 	for (int x1 = 0; x1 < r; x1++) {
	// 		for (int y1 = 0; y1 < r; y1++) {
	// 			System.out.print(matrix2[x1][y1]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


	// 	int[][] N = sol.answer(matrix1, matrix2, r);
	// 	for (int k = 0; k < r; k++) {
	// 		for (int p = 0; p < r; p++) {
	// 			System.out.print(N[k][p]+" ");
	// 		}
	// 		System.out.println();
	// 	}

	// }



















}