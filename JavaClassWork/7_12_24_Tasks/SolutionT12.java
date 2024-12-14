import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class SolutionT12 {
	 public int answer(int[][] massive, int len) {
	 	int summ = 0;
	 	for (int x = 0; x < len; x++) {
			for (int y = 0; y < massive[x].length; y++) {
				summ += massive[x][y];
			}
		}
		return summ;
	 }






	public static void main(String[] args) {
		SolutionT12 sol = new SolutionT12();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Введите кол-во строк: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][];
		for (int i = 0; i < n; i++) {
			System.out.println("Введите кол-во элементов в этой строке:");
			int k = sc.nextInt();
			int[] arr = new int[k];
			matrix[i] = arr;
			System.out.println("Введите элементы этой строки: ");
			for (int j = 0; j < k; j++) {
				arr[j] = sc.nextInt();
			}
		}


		System.out.println("Ваша ступенчатая матрица: ");
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				System.out.print(matrix[a][b]+" ");
			}
			System.out.println();
		}


		System.out.println(sol.answer(matrix, n));

	}
}