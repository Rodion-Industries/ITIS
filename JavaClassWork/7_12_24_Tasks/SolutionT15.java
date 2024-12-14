import java.util.Scanner;
import java.util.Arrays;
public class SolutionT15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // БИНАРНЫЙ ПОИСК (только для отсортированныго массива!)
    System.out.println("Введите длину массива: ");
    int n = sc.nextInt();
    System.out.println("Введите искомый элемент: ");
    int target = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    // создаем индексы (крайний левый и правый)
    int left = 0;
    int right = arr.length - 1;      

    while (left <= right) {
      int mid = left + (right - left)/2;
      if (arr[mid] > target) {
        right = mid;
      } 
      else if (arr[mid] < target) {
        left = mid + 1;
      }
      else {
        System.out.println("index["+mid+"] = "+arr[mid]+" = target = "+target);
        break;
      }
    }
    
        


    
  }
}