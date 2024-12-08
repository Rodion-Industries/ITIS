import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SolutionT4 {
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

	// 	for (int k = 0; k < size; k++) {
	// 		int count = 0;
	// 		for (int p = 0; p < size; p++) {
	// 			if (matrix[p][k] == 0) {
	// 				count += 1;
	// 			}
	// 		}
	// 		if (count == size) {
	// 			f = true;
	// 			break;
	// 		}
	// 	}

	// 	return f;
		
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT4 sol = new SolutionT4();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println(sol.answer(n));

	// }



	// ___________________________________________________________
	

	// // б)
	// public boolean answer(int size, int b) {
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

	// 	for (int k = 0; k < size; k++) {
	// 		int count = 0;
	// 		for (int p = 0; p < size; p++) {
	// 			if (0 <= matrix[p][k] && matrix[p][k] <= b) {
	// 				count += 1;
	// 			}
	// 		}
	// 		if (count == size) {
	// 			f = true;
	// 			break;
	// 		}
	// 	}

	// 	return f;
		
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT4 sol = new SolutionT4();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println("Введите число от 0 до 20: ");
	// 	int number = sc.nextInt();
	// 	System.out.println(sol.answer(n, number));

	// }



	// ____________________________________________________________

	// // в)
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

	// 	for (int k = 0; k < size; k++) {
	// 		int count = 0;
	// 		for (int p = 0; p < size; p++) {
	// 			if (matrix[p][k] % 2 == 0) {
	// 				count += 1;
	// 			}
	// 		}
	// 		if (count == size) {
	// 			f = true;
	// 			break;
	// 		}
	// 	}

	// 	return f;
		
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT4 sol = new SolutionT4();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println(sol.answer(n));

	// }



	// ___________________________________________

	// // г)
	// public boolean answer(int size) {
	// 	boolean f = false;
	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(-20, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}

	// 	for (int k = 0; k < size; k++) {
	// 		int otric = 0;
	// 		int poloz = 0;
	// 		for (int p = 0; p < size; p++) {
	// 			if (matrix[p][k] < 0) {
	// 				otric += 1;
	// 			}
	// 			else {
	// 				poloz += 1;
	// 			}
	// 		}
	// 		if (otric == poloz) {
	// 			f = true;
	// 			break;
	// 		}
	// 	}

	// 	return f;
		
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT4 sol = new SolutionT4();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println(sol.answer(n));

	// }


	// _______________________________________________
	// // д)
	// public boolean answer(int size) {
	// 	boolean f = false;
	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(1, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}

	// 	for (int k = 1; k < size; k++) {
	// 		int count = 0;
	// 		for (int p = 0; p < size; p++) {
	// 			if (matrix[p][k-1] == matrix[p][k]) {
	// 				count += 1;
	// 			}
	// 		}
	// 		if (count == size) {
	// 			f = true;
	// 			break;
	// 		}
	// 	}

	// 	return f;
		
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT4 sol = new SolutionT4();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println(sol.answer(n));

	// }




	//_________________________________________________
	// // е)
	// public boolean answer(int size) {
	// 	boolean f = false;
	// 	int[][] matrix = new int[size][size];
	// 	Random random = new Random();

	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = 0; j < size; j++) {
	// 			matrix[i][j] = random.nextInt(1, 21);
	// 			System.out.print(matrix[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}

	// 	int min = matrix[0][0];
	// 	for (int a = 0; a < size; a++) {
	// 		for (int b = 0; b < size; b++) {
	// 			if (matrix[a][b] < min) {
	// 				min = matrix[a][b];
	// 			}
	// 		}
	// 	}




	// 	for (int k = 0; k < size; k++) {
	// 		int count = 0;
	// 		for (int p = 0; p < size; p++) {
	// 			if (matrix[p][k] == min) {
	// 				count += 1;
	// 			}
	// 		}
	// 		if (count == 3) {
	// 			f = true;
	// 			break;
	// 		}
	// 	}

	// 	return f;
		
	// }

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	SolutionT4 sol = new SolutionT4();
	// 	System.out.println("Введите размерность квадратной матрицы n: ");
	// 	int n = sc.nextInt();
	// 	System.out.println(sol.answer(n));

	// }













}