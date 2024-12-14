import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Solution34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// // 1
		// String city = sc.nextLine();
		// if (city.length() % 2 == 0) {
		// 	System.out.println("Чётное "+city.length());
		// } else {
		// 	System.out.println("Нечётное "+city.length());
		// }



		// // 2
		// String first = sc.nextLine();
		// String second = sc.nextLine();
		// if (first.length() > second.length()) {
		// 	System.out.println(first+" длиннее");
		// }
		// if (first.length() == second.length()) {
		// 	System.out.println("Длины слов равны");
		// }
		// if (first.length() < second.length()) {
		// 	System.out.println(second+" длиннее");
		// }


		// // 3 
		// String first = sc.nextLine();
		// String second = sc.nextLine();
		// String third = sc.nextLine();
		// int n1 = first.length(), n2 = second.length(), n3 = third.length();
		// int max = n1;
		// int min = n1;
		// if (max < n2) {
		// 	max = n2;
		// }
		// if (max < n3) {
		// 	max = n3;
		// }
		// if (min > n2) {
		// 	min = n2;
		// }
		// if (min > n3) {
		// 	min = n3;
		// }
		// System.out.println();
		// if (min == n1) {
		// 	System.out.println(first);
		// }
		// if (min == n2) {
		// 	System.out.println(second);
		// }
		// if (min == n3) {
		// 	System.out.println(third);
		// }

		// if (max == n1) {
		// 	System.out.println(first);
		// }
		// if (max == n2) {
		// 	System.out.println(second);
		// }
		// if (max == n3) {
		// 	System.out.println(third);
		// }
		

		// // 4
		// String word = sc.nextLine();
		// int k = sc.nextInt();
		// System.out.println(word.charAt(k-1));


		// // 5
		// String word = sc.nextLine();
		// String n2 = "" + word.charAt(1);
		// String n4 = "" + word.charAt(3);
		// if (n2.equals(n4)) {
		// 	System.out.println(true);
		// } else {
		// 	System.out.println(false);
		// }


		// // 6
		// String word = sc.nextLine();
		// String first = "" + word.charAt(0);
		// String last = "" + word.charAt(word.length()-1);
		// if (first.equals(last)) {
		// 	System.out.println(true);
		// } else {
		// 	System.out.println(false);
		// }


		// 7
		// String word1 = sc.nextLine();
		// String word2 = sc.nextLine();
		// String n1 = "" + word1.charAt(0);
		// String nlast = "" + word2.charAt(word2.length()-1); 
		// if (n1.equals(nlast)) {
		// 	System.out.println(true);
		// } else {
		// 	System.out.println(false);
		// }




		// // 8
		// String word = sc.nextLine();
		// String n2 = "" + word.charAt(1);
		// String n4 = "" + word.charAt(3);
		// System.out.println(n2+n4);



		// // 9
		// String word = sc.nextLine();
		// int n = word.length() / 2;
		// System.out.println(word.substring(0, n));


		// // 10
		// String s = sc.nextLine();
		// int summ = 0;
		// String nums = "0123456789";
		// // // а
		// // for (int i = 0; i < s.length(); i++) {
		// // 	String f = ""+s.charAt(i);
		// // 	if (nums.contains(f)) {
		// // 		summ += Integer.parseInt(f);
		// // 	}
		// // }
		// // System.out.println(summ);
		// // б
		// int max = -999;
		// for (int i = 0; i < s.length(); i++) {
		// 	String f = ""+s.charAt(i);
		// 	if (nums.contains(f)) {
		// 		if (max < Integer.parseInt(f)) {
		// 			max = Integer.parseInt(f);
		// 		}
		// 	}
		// }
		// System.out.println(max);



		// // 11
		// String s = sc.nextLine();
		// String sr = "0123456789";
		// String nums = "";
		// for (int i = 0; i < s.length(); i++) {
		// 	String f = "" + s.charAt(i);
		// 	if (sr.contains(f)) {
		// 		nums += f;
		// 	}
		// }
		// System.out.println(nums);


		// // 12
		// String s = "яблоко";
		// System.out.println(s.substring(1, 5));
		// System.out.println(s.substring(3, 6));


		// // 13
		// String s = "информатика";
		// System.out.println(s.substring(2, 7));
		// System.out.println(s.substring(7, 10));


		// // 14
		// String s = sc.nextLine();
		// // // 1)
		// // System.out.println(s.substring(s.length() / 2, s.length())+s.substring(0, s.length() / 2));
		// // 2)
		// String start = "";
		// String finish = "";
		// for (int i = 0; i < s.length(); i++) {
		// 	if (i < s.length()/2) {
		// 		start += s.charAt(i);
		// 	} else {
		// 		finish += s.charAt(i);
		// 	}
		// }
		// System.out.println(finish+start);


		// // 15
		// String s = sc.nextLine();
		// int k = sc.nextInt();
		// // // 1)
		// // System.out.println(s.substring(k, s.length()) + s.substring(0, k));
		// // 2)
		// String start = "";
		// String end = "";
		// for (int i = 0; i < s.length(); i++) {
		// 	String f = ""+s.charAt(i);
		// 	if (i < k) {
		// 		start += f;
		// 	} else {
		// 		end += f;
		// 	}
		// }	
		// System.out.println(end+start);



		// // 16
		// String name = sc.nextLine();
		// for (int i = 0; i < name.length(); i++) {
		// 	String f = ""+name.charAt(i);
		// 	System.out.println(f);
		// }


		// // 17
		// String s = sc.nextLine();
		// for (int i = s.length()-1; i > -1; i--) {
		// 	String f = ""+s.charAt(i);
		// 	System.out.print(f);
		// }


		// // 18
		// String s1 = sc.nextLine();
		// String s2 = "";
		// for (int i = 0; i < s1.length(); i++) {
		// 	String f = ""+s1.charAt(i);
		// 	if (i % 2 == 0) {
		// 		s2 += f;
		// 	}
		// }
		// System.out.println(s2);


		// // 19
		// System.out.println("Введите повторяющийся символ: ");
		// String letter = sc.nextLine();
		// System.out.println("Сколько раз будет повторяться: ");
		// int k = sc.nextInt();
		// for (int i = 0; i < k; i++) {
		// 	System.out.print(letter);
		// }


		// // 20
		// String s = sc.nextLine();
		// System.out.println("++++"+s+"-----");


		// 21
		// String s = sc.nextLine();
		// String first = sc.nextLine();
		// String end = sc.nextLine();
		// System.out.print("first = "+first+" ");
		// for (int i = 0; i < s.length(); i++) {
		// 	String f = "" + s.charAt(i);
		// 	if (first.equals(f)) {
		// 		System.out.print(i+", ");
		// 	}
		// }
		// System.out.println();
		// System.out.print("end = "+end+" ");
		// for (int j = 0; j < s.length(); j++) {
		// 	String g = ""+s.charAt(j);
		// 	if (end.equals(g)) {
		// 		System.out.print(j+", ");
		// 	}
		// }	

		// // 22
		// String s = sc.nextLine();
		// int count = 0;
		// for (int i = 0; i < s.length()-1; i++) {
		// 	if (s.charAt(i) == 'н' && s.charAt(i + 1) == 'н') {
        //         count += 1;
        //     }
		// }
		// System.out.println("Кол-во вхождений нн: "+count);


		// // 23
		// String s = sc.nextLine();
		// int countPlus = 0;
		// int countStar = 0;
		// for (int i = 0; i < s.length(); i++) {
		// 	String f = ""+s.charAt(i);
		// 	if (f.equals("+")) {
		// 		countPlus += 1;
		// 	}
		// 	if (f.equals("*")) {
		// 		countStar += 1;
		// 	}
		// }

		// System.out.println("+: "+countPlus);
		// System.out.println("*: "+countStar);



		// 24
		// String s = sc.nextLine();
		// // a)
		// int countPo = 0;
		// for (int i = 0; i < s.length()-1; i++) {
		// 	if (s.charAt(i) == 'р' && s.charAt(i+1) == 'о') {
		// 		countPo += 1;
		// 	}
		// }
		// System.out.println("ро: "+countPo);

		// // б)
		// System.out.println("Введите вхождение из двух букв: ");
		// String ss = sc.nextLine();
		// int count = 0;
		// for (int i = 0; i < s.length()-1; i++) {
		// 	String g = ""+s.charAt(i)+s.charAt(i+1);
		// 	if (g.equals(ss)) {
		// 		count += 1;
		// 	}
		// }
		// System.out.println(count);


		// // в)
		// System.out.println("Введите вхождение из букв: ");
		// String v = sc.nextLine();
		// int k = s.length()-v.length()-1;
		// int count = 0;
		// for (int i = 0; i < k; i++) {
		// 	String f = s.substring(i, i+v.length()-1);
		// 	if (f.equals(v)) {
		// 		count += 1;
		// 	}
		// }
		// System.out.println(count);



		
		// // 25
		// String s = sc.nextLine();
		// // // 1)
		// // String p = "";
		// // for (int i = 0; i < s.length(); i++) {
		// // 	if (s.charAt(i) != ',') {
		// // 		p += s.charAt(i);
		// // 	} else {
		// // 		break;
		// // 	}
		// // }
		// // System.out.println(p);

		// // 2)
		// int count = 0;
		// for (int i = 0; i < s.length(); i++) {
		// 	if (s.charAt(i) == ',') {
		// 		count += 1; 
		// 	}
		// }
		// if (count == 0) {
		// 	System.out.println("Нет запятых");
		// } else {
		// 	String p = "";
		// 	for (int i = 0; i < s.length(); i++) {
		// 		if (s.charAt(i) != ',') {
		// 			p += s.charAt(i);
		// 		} else {
		// 			break;
		// 		}
		// 	}
		// 	System.out.println(p);
		// }




		// // 26
		// String s = sc.nextLine();
		// // а)
		// for (int i = 0; i < s.length(); i++) {
		// 	if (s.charAt(i) == 'е') {
		// 		System.out.println(i);
		// 		break;
		// 	}
		// }
		// б)
		// int c = 0;
		// for (int i = 0; i < s.length(); i++) {
		// 	if (s.charAt(i) == 'е') {
		// 		c = i;
		// 	}
		// }
		// System.out.println(c);



		// 27
		// String s = sc.nextLine();
		// s = s.replace("да", "не");
		// System.out.println(s);


		// // 28
		// String s = sc.nextLine();
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// String s3 = s.replace(s1, s2);
		// System.out.println(s3);


		// // 29
		// String s = sc.nextLine();
		// for (int i = s.length()-1; i > -1; i--) {
		// 	String f = ""+s.charAt(i);
		// 	System.out.print(f);
		// }


		// // // 30
		// String str = sc.nextLine();
		// int k = sc.nextInt();
		// int s = sc.nextInt();

		// String sr = str.substring(k, s-1);
		// String start = str.substring(0, k);
		// String end = str.substring(s-1, str.length());

		// String rev = "";
		// for (int i = sr.length()-1; i > -1; i--) {
		// 	rev += sr.charAt(i);
		// }

		// System.out.println(sr+" "+start+" "+end);
		// System.out.println(rev);
		// System.out.println(start+rev+end);


		// // // 31
		// int max = 0;
		// String s = sc.nextLine();
		// for (int i = 0; i < s.length(); i++) {
		// 	int count = 0;
		// 	for (int j = 1; j < s.length(); j++) {
		// 		if (s.charAt(i) == s.charAt(j)) {
		// 			count += 1;
		// 		}
		// 	}
		// 	if (max < count) {
		// 		max = count;
		// 	}
		// }
		// System.out.println(max);



		// 32
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// for (int i = 0; i < s1.length(); i++) {
		// 	for (int j = 0; j < s2.length(); j++) {
		// 		String f = ""+s1.charAt(i);
		// 		if (s2.contains(f)) {
		// 			System.out.println(f+" +");
		// 			break;
		// 		}
		// 		else {
		// 			System.out.println(f+" -");
		// 			break;
		// 		}
		// 	}
		// }


		// // 33
		// String s = sc.nextLine();
		// String[] arr = new String[s.length()];
		// for (int i = 0; i < s.length(); i++) {
		// 	arr[i] = ""+s.charAt(i);
		// }
		// System.out.println(Arrays.toString(arr));


		// // // 34
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		
		// s1 = s1.replaceAll("[.,!?]", "");
		// String[] arr = s1.split("\\s+"); // "\\s+" - это все-все пробелы

		// for (int i = 0; i < arr.length; i++) {
		// 	if (s2.contains(arr[i])) {
		// 		System.out.println(arr[i]+" +");
		// 	} else {
		// 		System.out.println(arr[i]+" -");
		// 	}
		// }










	}
}