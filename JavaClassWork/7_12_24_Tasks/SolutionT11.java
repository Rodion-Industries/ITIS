import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class SolutionT11 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите кол-во строк в матрице: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		
		for (int i = 0; i < n; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j <= i; j++) {
				arr[i][j] = i*j;
			}
		}

		System.out.println();

		for (int a = 0; a < n; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}



	}
}