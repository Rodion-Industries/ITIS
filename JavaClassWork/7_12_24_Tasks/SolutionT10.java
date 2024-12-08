import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT10 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionT10 sol = new SolutionT10();
		Random random = new Random();

		System.out.println("Введите кол-во строк: ");
		int s = sc.nextInt();

		int[][] stepArr = new int[s][];
		for (int i = 0; i < s; i++) {
			System.out.println("Введите кол-во столбцов для "+(i+1)+" строки: ");
			int k = sc.nextInt();
			stepArr[i] = new int[k];
			for (int j = 0; j < stepArr[i].length; j++) {
				stepArr[i][j] = random.nextInt(0, 101);
			}
		}


		for (int a = 0; a < stepArr.length; a++) {
			for (int b = 0; b < stepArr[a].length; b++) {
				System.out.print(stepArr[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}






}