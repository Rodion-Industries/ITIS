import java.util.Scanner;
import java.util.Arrays;
public class SolutionT14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ЛИНЕЙНЫЙ ПОИСК - по всем элементам массива, пока не найдётся нужный элемент
    int c = 0;
    System.out.println("Введите длину массива: ");
    int n = sc.nextInt();
    System.out.println("Введите элементы массива: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Какой элемент нужно найти: ");
    int target = sc.nextInt();
    for (int j = 0; j < n; j++) {
      if (arr[j] == target) {
        System.out.println("index["+(j)+"] = "+arr[j]+" = taget = "+target);
        c += 1;
      }
    }
    if (c == 0) {
      System.out.println("Нет такого значения в массиве!");
    }
    
  }
}