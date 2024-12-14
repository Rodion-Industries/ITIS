import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT5 {
	// а.1)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionT5 sol = new SolutionT5();
		System.out.println("Введите размерность квадратной матрицы: ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		Random random = new Random();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = random.nextInt(0, 21);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();


		int[] arr1 = new int[size];
		for (int a = 0; a < size; a++) {
			arr1[a] = matrix[0][a];
		}

		int[] arr2 = new int[size];
		for (int b = 0; b < size; b++) {
			arr2[b] = matrix[1][b];
		}



		for (int x = 0; x < size; x++) {
			matrix[0][x] = arr2[x];
			matrix[1][x] = arr1[x];
		}

		for (int k = 0; k < size; k++) {
			for (int p = 0; p < size; p++) {
				System.out.print(matrix[k][p]+" ");
			}
			System.out.println();
		}
		

	}

	// // а.2)
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT5 sol = new SolutionT5();
	// 	System.out.println("Введите размерность квадратной матрицы: ");
	// 	int size = sc.nextInt();
	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(0, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


		

	// 	for (int a = 0; a < size-1; a++) {
	// 		int k1 = matrix[0][a];
	// 		int k2 = matrix[1][a];
	// 		matrix[0][a] = k2;
	// 		matrix[1][a] = k1;
	// 	}



	// 	for (int k = 0; k < size; k++) {
	// 		for (int p = 0; p < size; p++) {
	// 			System.out.print(matrix[k][p]+" ");
	// 		}
	// 		System.out.println();
	// 	}
		

	// }

	
	//________________________________________________________________________________________________
	// // б.1)
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT5 sol = new SolutionT5();
	// 	System.out.println("Введите размерность квадратной матрицы: ");
	// 	int size = sc.nextInt();
	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(0, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


	// 	int[] arr1 = new int[size];
	// 	for (int a = 0; a < size; a++) {
	// 		arr1[a] = matrix[a][0];
	// 	}

	// 	int[] arr2 = new int[size];
	// 	for (int b = 0; b < size; b++) {
	// 		arr2[b] = matrix[b][1];
	// 	}



	// 	for (int x = 0; x < size; x++) {
	// 		matrix[x][0] = arr2[x];
	// 		matrix[x][1] = arr1[x];
	// 	}

	// 	for (int k = 0; k < size; k++) {
	// 		for (int p = 0; p < size; p++) {
	// 			System.out.print(matrix[k][p]+" ");
	// 		}
	// 		System.out.println();
	// 	}
		

	// }





	// // а.2)
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT5 sol = new SolutionT5();
	// 	System.out.println("Введите размерность квадратной матрицы: ");
	// 	int size = sc.nextInt();
	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(0, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


		

	// 	for (int a = 0; a < size-1; a++) {
	// 		int k1 = matrix[a][0];
	// 		int k2 = matrix[a][1];
	// 		matrix[a][0] = k2;
	// 		matrix[a][1] = k1;
	// 	}



	// 	for (int k = 0; k < size; k++) {
	// 		for (int p = 0; p < size; p++) {
	// 			System.out.print(matrix[k][p]+" ");
	// 		}
	// 		System.out.println();
	// 	}
		

	// }









}