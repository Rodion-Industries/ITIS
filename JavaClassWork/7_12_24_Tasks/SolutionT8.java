import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT8 {
	// // а)
	// public int[] answer(int[][] massive, int len, int p1) {
		
	// 	int[] arr = new int[p1];

	// 	int count = 0;
	// 	for (int x = 0; x < len-1; x++) {
	// 		for (int y = 0; y < len; y++) {
	// 			if (y > x) {
	// 				arr[count] = massive[x][y];
	// 				count+=1;
	// 			}
	// 		}

	// 	}
	// 	return arr;
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT8 sol = new SolutionT8();
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

	// 	int p = 0;
	// 	for (int a = 0; a < n; a++) {
	// 		p += (n - (a+1));
	// 	}
	// 	System.out.println(p);

	// 	System.out.println(Arrays.toString(sol.answer(matrix, n, p)));
	// }






	// // б)
	// public int[] answer(int[][] massive, int len, int p1) {
		
	// 	int[] arr = new int[p1];

	// 	int count = 0;
	// 	for (int x = 0; x < len-1; x++) {
	// 		for (int y = 0; y < len; y++) {
	// 			if (y > x) {
	// 				arr[count] = massive[x][y];
	// 				count+=1;
	// 			}
	// 		}

	// 	}
	// 	return arr;
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT8 sol = new SolutionT8();
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

	// 	System.out.println("А теперь её немного Транспонируем: ");
		// int[][] matrixtransp = new int[n][n];
		// for (int a = 0; a < n; a++) {
		// 	for (int b = 0; b < n; b++) {
		// 		int k1 = matrix[a][b];
		// 		int k2 = matrix[b][a];

		// 		matrixtransp[a][b] = k2;
		// 		matrixtransp[b][a] = k1;
		// 	}
		// }

	// 	for (int w = 0; w < n; w++) {
	// 		for (int z = 0; z < n; z++) {
	// 			System.out.print(matrixtransp[w][z]+" ");
	// 		}
	// 		System.out.println();
	// 	}


	// 	int p = 0;
	// 	for (int a = 0; a < n; a++) {
	// 		p += (n - (a+1));
	// 	}
	// 	System.out.println(p);

	// 	System.out.println(Arrays.toString(sol.answer(matrixtransp, n, p)));

	// }





	// // в)
	// public int[] answer(int[][] massive, int len, int p1) {
		
	// 	int[] arr = new int[p1];

	// 	int count = 0;
	// 	int f = len-1;
	// 	for (int x = 0; x < len-1; x++) {
	// 		for (int y = 0; y < f; y++) {
	// 			arr[count] = massive[x][y];
	// 			count+=1;
				
	// 		}
	// 		f -= 1;
	// 	}
	// 	return arr;
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT8 sol = new SolutionT8();
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

	// 	int p = 0;
	// 	for (int a = 0; a < n; a++) {
	// 		p += (n - (a+1));
	// 	}
	// 	System.out.println(p);

	// 	System.out.println(Arrays.toString(sol.answer(matrix, n, p)));
	// }








	// // г)
	public int[] answer(int[][] massive, int len, int p1) {
		
		int[] arr = new int[p1];

		int count = 0;
		for (int x = 0; x < len-1; x++) {
			for (int y = 0; y < len; y++) {
				if (y > x) {
					arr[count] = massive[x][y];
					count+=1;
				}
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionT8 sol = new SolutionT8();
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

		System.out.println("А теперь её перевернём снизу вверх: ");
		int v = n-1;
		for (int m = 0; m < n/2; m++) {
			for (int t = 0; t < n; t++) {
				int k1 = matrix[m][t];
				int k2 = matrix[m+v][t];

				matrix[m][t] = k2;
				matrix[m+v][t] = k1;

				
			}
			v -= 2;
		}


		for (int w = 0; w < n; w++) {
			for (int z = 0; z < n; z++) {
				System.out.print(matrix[w][z]+" ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("А теперь Транспонируем перевёрнутую матрицу: ");
		int[][] matrixtransp = new int[n][n];
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				int k1 = matrix[a][b];
				int k2 = matrix[b][a];

				matrixtransp[a][b] = k2;
				matrixtransp[b][a] = k1;
			}
		}

		for (int w1 = 0; w1 < n; w1++) {
			for (int z1 = 0; z1 < n; z1++) {
				System.out.print(matrixtransp[w1][z1]+" ");
			}
			System.out.println();
		}

		System.out.println("А теперь Транспонируем еще раз транспонируем транспонированную перевёрнутую матрицу: ");
		int[][] matrixtransp1 = new int[n][n];
		for (int a1 = 0; a1 < n; a1++) {
			for (int b1 = 0; b1 < n; b1++) {
				int k1 = matrixtransp[a1][b1];
				int k2 = matrixtransp[b1][a1];

				matrixtransp1[a1][b1] = k2;
				matrixtransp1[b1][a1] = k1;
			}
		}

		for (int w2 = 0; w2 < n; w2++) {
			for (int z2 = 0; z2 < n; z2++) {
				System.out.print(matrixtransp1[w2][z2]+" ");
			}
			System.out.println();
		}



		

		// подсчёт кол-ва элементов под/над диагональю
		int p = 0;
		for (int a = 0; a < n; a++) {
			p += (n - (a+1));
		}
		System.out.println();
		System.out.println("Длина одномерного массива, т.е. кол-во элементов под/над диагональю = "+p);
		System.out.println("Искомый массив: ");
		System.out.println(Arrays.toString(sol.answer(matrixtransp1, n, p)));

	}

}