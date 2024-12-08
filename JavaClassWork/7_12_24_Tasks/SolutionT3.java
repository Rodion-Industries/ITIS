import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT3 {

	public int answer(int size, int stroka, int stolb) {

		int[][] matrix = new int[size][size];
		Random random = new Random();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = random.nextInt(0, 21);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		int summK = 0;
		for (int p = 0; p < size; p++) {
			summK += matrix[stroka][p];
		}

		int summS = 0;
		for (int k = 0; k < size; k++) {
			summS += matrix[k][stolb];
		}

		int max = summK;
		if (summS > max) {
			max = summS;
		}

		return max;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionT3 sol = new SolutionT3();
		System.out.println("Введите размерность квадратной матрицы n: ");
		int n = sc.nextInt();
		System.out.println("Введите номер k строки: ");
		int k = sc.nextInt() - 1;
		System.out.println("Введите номер s столбца: ");
		int s = sc.nextInt() - 1;
		System.out.println(sol.answer(n, k, s));

	}








}