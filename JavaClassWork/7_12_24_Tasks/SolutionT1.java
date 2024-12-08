import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT1 {
	// а)
	public boolean answer(int size) {
		boolean f = false;

		int[][] matrix = new int[size][size];
		Random random = new Random();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = random.nextInt(0, 21);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		int mult = 1;
		for (int p = 0; p < size; p++) {
			mult *= matrix[p][1];
		}

		if (100 <= mult && mult <= 999) {
			f = true;
		}	
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionT1 sol = new SolutionT1();
		System.out.println("Введите размерность квадратной матрицы n: ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("Error!");
		} else {
			System.out.println(sol.answer(n));
		}
	}


	// б)
	// public boolean answer(int size, int summ, int number) {
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

	// 	int summa = 0;
	// 	for (int k = 0; k < size; k++) {
	// 		summa += matrix[number][k];
	// 	}

	// 	if (summa == summ) {
	// 		f = true;
	// 	}	
	// 	return f;
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT1 sol = new SolutionT1();
	// 	System.out.println("Введите длину размер матрицы: ");
	// 	int d = sc.nextInt();
	// 	System.out.println("Введите число n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println("Введите номер строки: ");
	// 	int num = sc.nextInt() - 1;
	// 	System.out.println(sol.answer(d, n, num));
	// }



}