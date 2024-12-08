import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT9 {
	// // а)
	// public int[] answer(int[][] massive, int k, int len) {
	// 	int[] arr = new int[k];
	// 	int c = k;
	// 	for (int x = 0; x < len; x++) {
	// 		for (int y = 0; y < len; y++) {
	// 			if (massive[x][y] % 3 == 0) {
	// 				arr[k-c] = massive[x][y];
	// 				c -= 1;
	// 			}
	// 		}
			
	// 	}
	// 	return arr;
	// }


	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT9 sol = new SolutionT9();
	// 	System.out.println("Введите ранг матрицы (квадратной): ");
	// 	int n = sc.nextInt();

	// 	Random random = new Random();
	// 	int[][] matrix = new int[n][n];
	// 	for (int i = 0; i < n; i++) {
	// 		for (int j = 0; j < n; j++) {
	// 			matrix[i][j] = random.nextInt(-20, 21);
	// 		}
	// 	}

	// 	System.out.println("Ваша матрица: ");
	// 	for (int k = 0; k < n; k++) {
	// 		for (int p = 0; p < n; p++) {
	// 			System.out.print(matrix[k][p]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	System.out.println();


	// 	int count = 0;
	// 	for (int a = 0; a < n; a++) {
	// 		for (int b = 0; b < n; b++) {
	// 			if (matrix[a][b] % 3 == 0) {
	// 				count += 1;
	// 			}
	// 		}
	// 	}



	// 	System.out.println(Arrays.toString(sol.answer(matrix, count, n)));
	
	// }












	// б)
	public String answer(int[][] massive, int plus, int minus, int len) {
		int[] arrP = new int[plus];
		int[] arrM = new int[minus];
		int c1 = plus;
		int c2 = minus;

		for (int x = 0; x < len; x++) {
			for (int y = 0; y < len; y++) {
				if (massive[x][y] > 0) {
					arrP[plus-c1] = massive[x][y];
					c1 -= 1;
				}
			}
			
		}

		for (int x1 = 0; x1 < len; x1++) {
			for (int y1 = 0; y1 < len; y1++) {
				if (massive[x1][y1] < 0) {
					arrM[minus-c2] = massive[x1][y1];
					c2 -= 1;
				}
			}
			
		}
		String s = Arrays.toString(arrP) + "\n" + Arrays.toString(arrM) ;
		return s;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionT9 sol = new SolutionT9();
		System.out.println("Введите ранг матрицы (квадратной): ");
		int n = sc.nextInt();

		Random random = new Random();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = random.nextInt(-20, 21);
			}
		}

		System.out.println("Ваша матрица: ");
		for (int k = 0; k < n; k++) {
			for (int p = 0; p < n; p++) {
				System.out.print(matrix[k][p]+" ");
			}
			System.out.println();
		}
		System.out.println();


		int poloz = 0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				if (matrix[a][b] > 0) {
					poloz += 1;
				}
			}
		}

		int otric = 0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				if (matrix[a][b] < 0) {
					otric += 1;
				}
			}
		}

		int count = poloz + otric;

		System.out.println(sol.answer(matrix, poloz, otric, n));
	
	}















}