import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT2 {
	// // а)
	// public boolean answer(int size) {
	// 	boolean f = false;

	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(0, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}

	// 	int summ = 0;
	// 	for (int p = 0; p < size; p++) {
	// 		summ += matrix[3][p];
	// 	}

	// 	if (10 <= summ && summ <= 99) {
	// 		f = true;
	// 	}	
	// 	return f;
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT2 sol = new SolutionT2();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	if (n < 4) {
	// 		System.out.println("Error: ранг матрицы должен быть не меньше 4!");
	// 	} else {
	// 		System.out.println(sol.answer(n));
	// 	}
	// }




	// // б)
	// public boolean answer(int size, int proizv, int number) {
	// 	boolean f = false;

	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(-5, 11);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}

	// 	int mult = 1;
	// 	for (int k = 0; k < size; k++) {
	// 		mult *= matrix[k][number];
	// 	}

	// 	if (mult <= proizv) {
	// 		f = true;
	// 	}	
	// 	return f;
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT2 sol = new SolutionT2();
	// 	System.out.println("Введите длину размер матрицы: ");
	// 	int d = sc.nextInt();
	// 	System.out.println("Введите число n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println("Введите номер столбца: ");
	// 	int num = sc.nextInt() - 1;
	// 	System.out.println(sol.answer(d, n, num));
	// }



}