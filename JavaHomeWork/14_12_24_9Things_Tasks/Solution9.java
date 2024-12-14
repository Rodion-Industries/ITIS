import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Solution9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// // 1
		// // А)
		// System.out.println("Введите размерность матрицы (квадратной) n: ");
		// int n = sc.nextInt();
		// int[][] arr = new int[n][n];
		// System.out.println("Введите построчно элементы матрицы: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }
		// System.out.println("Ваша матрица: ");
		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		System.out.print(arr[x][y]+" ");
		// 	}
		// 	System.out.println();
		// }



		// int c = 0;
		// for (int a = 0; a < n; a++) {
		// 	int count = 0;
		// 	for (int b = 0; b < n; b++) {
		// 		if (arr[a][b] == 0) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count == n) {
		// 		System.out.println("Номер нулевой строки: "+(a+1));
		// 		c += 1;
		// 	}
		// }
		// if (c == 0) {
		// 	System.out.println("В матрице нет нулевых строк!");
		// }




		// // Б)
		// System.out.println("Введите размерность матрицы (квадратной) n: ");
		// int n = sc.nextInt();
		// int[][] arr = new int[n][n];
		// System.out.println("Введите построчно элементы матрицы: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }
		// System.out.println("Ваша матрица: ");
		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		System.out.print(arr[x][y]+" ");
		// 	}
		// 	System.out.println();
		// }

		// int c = 0;
		// for (int a = 0; a < n; a++) {
		// 	int count = 0;
		// 	int povtor = arr[a][1];
		// 	for (int b = 0; b < n; b++) {
		// 		if (arr[a][b] == povtor) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count == n) {
		// 		System.out.println("Номер строки, в которой все элементы одинаковые: "+(a+1));
		// 		c += 1;
		// 	}
		// }

		// if (c == 0) {
		// 	System.out.println("В матрице нет строк, в которых есть все одинаковые элементы!");
		// }





		// // В)
		// System.out.println("Введите размерность матрицы (квадратной) n: ");
		// int n = sc.nextInt();
		// int[][] arr = new int[n][n];
		// System.out.println("Введите построчно элементы матрицы: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }
		// System.out.println("Ваша матрица: ");
		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		System.out.print(arr[x][y]+" ");
		// 	}
		// 	System.out.println();
		// }

		// int c = 0;
		// for (int a = 0; a < n; a++) {
		// 	int count = 0;
		// 	for (int b = 0; b < n; b++) {
		// 		if (arr[a][b] % 2 != 0) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (count == n) {
		// 		System.out.println("Номер строки, в которой все элементы нечётные: "+(a+1));
		// 		c += 1;
		// 	}
		// }

		// if (c == 0) {
		// 	System.out.println("В матрице нет строк, в которых все элементы нечётные!");
		// }





		// // Г)
		// System.out.println("Введите размерность матрицы (квадратной) n: ");
		// int n = sc.nextInt();
		// int[][] arr = new int[n][n];
		// System.out.println("Введите построчно элементы матрицы: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }
		// System.out.println("Ваша матрица: ");
		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		System.out.print(arr[x][y]+" ");
		// 	}
		// 	System.out.println();
		// }

		// int c1 = 0;
		// int c2 = 0;

		// for (int a = 0; a < n; a++) {
		// 	int countUp = 0;
		// 	int countDown = 0;
		// 	for (int b = 0; b < (n-1); b++) {
		// 		if (arr[a][b] < arr[a][b+1]) {
		// 			countUp += 1;
		// 		}
		// 		if (arr[a][b] > arr[a][b+1]) {
		// 			countDown += 1;
		// 		}
		// 	}
		// 	if (countUp == n-1) {
		// 		System.out.println("Номер строки, в которой все элементы образуют монотонно возраст. ф-ию: "+(a+1));
		// 		c1 += 1;
		// 	}
		// 	if (countDown == n-1) {
		// 		System.out.println("Номер строки, в которой все элементы образуют монотонно убывающ. ф-ию: "+(a+1));
		// 		c2 += 1;
		// 	}
		// }

		// if (c1 == 0) {
		// 	System.out.println("В матрице нет строк, в которых все элементы монотонно возрастают!");
		// }
		// if (c2 == 0) {
		// 	System.out.println("В матрице нет строк, в которых все элементы монотонно убывают!");
		// }





		// // Д)
		// System.out.println("Введите размерность матрицы (квадратной) n: ");
		// int n = sc.nextInt();
		// int[][] arr = new int[n][n];
		// System.out.println("Введите построчно элементы матрицы: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }
		// System.out.println("Ваша матрица: ");
		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		System.out.print(arr[x][y]+" ");
		// 	}
		// 	System.out.println();
		// }

		// int count = 0;

		// for (int a = 0; a < n; a++) {
		// 	String f = "";
		// 	String p = "";
		// 	for (int b = 0; b < n; b++) {
		// 		f += arr[a][b];
		// 	}
		// 	for (int k = f.length()-1; k > -1; k--) {
		// 		p += f.charAt(k);
		// 	}
		// 	if (f.equals(p)) {
		// 		System.out.println("Номер строки, в которой элементы образуют симмеиричную послед-ть (палиндром): "+(a+1));
		// 		count += 1;
		// 	}
		// }

		// if (count == 0) {
		// 	System.out.println("В матрице нет строк палиндромов!");
		// }








		// 2
		// System.out.println("Введите размерность матрицы (квадратной) n: ");
		// int n = sc.nextInt();
		// int[][] arr = new int[n][n];
		// System.out.println("Введите построчно элементы матрицы: ");
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = sc.nextInt();
		// 	}
		// }
		// System.out.println("Ваша матрица: ");
		// for (int x = 0; x < n; x++) {
		// 	for (int y = 0; y < n; y++) {
		// 		System.out.print(arr[x][y]+" ");
		// 	}
		// 	System.out.println();
		// }

		// int summ = 0;
		// for (int z = 0; z < n; z++) {
		// 	if (arr[z][0] < 0) {
		// 		 for (int w = 0; w < n; w++) {
		// 		 	summ += arr[z][w];
		// 		 }
		// 	}
		// }

		// System.out.println(summ);






		// // 3
		// String s = sc.nextLine();
		// s = s.replaceAll("[,.!?]", "");
		// String[] arr = s.split("\\s+"); 
		// int count = 0;
		// for (int i = 0; i < arr[0].length(); i++) {
		// 	if (s.charAt(i) == 'о') {
		// 		count += 1;
		// 	}
		// }
		// System.out.println(count);




		// 4
		// // 1) и 2)
		// System.out.println("Введите длину послед-ти: ");
		// int n = sc.nextInt();
		// System.out.println("Введите элементы послед-ти: ");
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// 	arr[i] = sc.nextInt();
		// }

		// Arrays.sort(arr);

		// int count = 1;
		// for (int x = 0; x < n-1; x++) {
		// 	if (arr[x] == arr[x+1]) {
		// 		count += 1;
		// 	}
		// }
		// System.out.println(count);



		// 5 (3)
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();

		// String s3 = "";
		// for (int a = 0; a < s1.length(); a++) {
		// 	String f = ""+s1.charAt(a);
		// 	if ((s3.contains(f)) == false) {
		// 		s3 += f;
		// 	}
		// }

		// for (int i = 0; i < s3.length(); i++) {
		// 	String g = ""+s3.charAt(i);
		// 	if (s2.contains(g)) {
		// 		System.out.print("да ");
		// 	}
		// 	else {
		// 		System.out.print("нет ");
		// 	}
		// }


		// // 6 (4) 1) и 2)
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();

		// if (s1.length() == s1.length()) {
		// 	int count1 = 0;
		// 	for (int i = 0; i < s1.length(); i++) {
		// 		String a1 = ""+s1.charAt(i);
		// 		String a2 = ""+s2.charAt(i);
		// 		if (a1.equals(a2)) {
		// 			count1 += 1;
		// 		}
		// 	}
		// 	System.out.println(count1);
		// } 
		// else if (s1.length() < s2.length()) {
		// 	int count2 = 0;
		// 	for (int i = 0; i < s1.length(); i++) {
		// 		String a1 = ""+s1.charAt(i);
		// 		String a2 = ""+s2.charAt(i);
		// 		if (a1.equals(a2)) {
		// 			count2 += 1;
		// 		}
		// 	}
		// 	System.out.println(count2);
		// }
		// else { 
		// 	int count3 = 0;
		// 	for (int i = 0; i < s2.length(); i++) {
		// 		String a1 = ""+s1.charAt(i);
		// 		String a2 = ""+s2.charAt(i);
		// 		if (a1.equals(a2)) {
		// 			count3 += 1;
		// 		}
		// 	}
		// 	System.out.println(count3);
		// }

		// // 7 (5)
		// String s = sc.nextLine();
		// String nums = "0123456789";

		// int max = -999;
		// for (int i = 0; i < s.length(); i++) {
		// 	String f = ""+s.charAt(i);
		// 	if (nums.contains(f)) {
		// 		if (max < Integer.parseInt(f)) {
		// 			max = Integer.parseInt(f);
		// 		}
		// 	}
		// }
		
		// int c = 0;
		// for (int j = 0; j < s.length(); j++) {
		// 	String g = ""+s.charAt(j);
		// 	if (g.equals(max+"")) {
		// 		c = j;
		// 		break;
		// 	}
		// }
		// System.out.println(c+1);


		



		// // 8 (6)
		// String s1 = sc.nextLine();
		// String s2 = "";
		// for (int i = s1.length()-1; i > -1; i--) {
		// 	String f = ""+s1.charAt(i);
		// 	s2 += f;
		// }
		// if (s1.equals(s2)) {
		// 	System.out.println("Слово - перевёртыш )");
		// } else {
		// 	System.out.println("Слово не является перевёртышем!");
		// }



		// 9 (7 - то же самое 3-е задание)


		// // 10 (8)
		// String s = sc.nextLine();

		// // // а)
		// // String s1 = s.substring(0, 4);
		// // String s2 = s.substring(4, 8);
		// // String s3 = s.substring(8, 12);
		// // System.out.println(s2+s3+s1);


		// // // б)
		// // String s1 = s.substring(0, 4);
		// // String s2 = s.substring(4, 8);
		// // String s3 = s.substring(8, 12);
		// // System.out.println(s3+s1+s2);


		// // 11 (9) 1) и 2) (имеется в виду, что программа униварсальна для обоих пунктов)
		// String s = sc.nextLine();
		// s = s.replaceAll("[.,!?]", "");
		// String[] arr = s.split("\\s+");
		// System.out.println(arr.length);






























	}
}