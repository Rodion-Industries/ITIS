import java.util.Scanner;
import java.util.Arrays;
public class SolutionT13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите кол-во строк в матрице: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][];
		for (int i = 0; i < n; i++) {
			System.out.println("Введите кол-во элементов в строке: "+(i+1));
			int k = sc.nextInt();
			int[] arr = new int[k];
			matrix[i] = arr;
			System.out.println("Введите элементы строки: "+(i+1));
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

		int max = matrix[0][0];
		for (int m = 0; m < n; m++) {
			for (int p = 0; p < matrix[m].length; p++) {
				if (max < matrix[m][p]) {
					max = matrix[m][p];
				}
			}
		}

		System.out.println("MAX = "+max);







	}
}