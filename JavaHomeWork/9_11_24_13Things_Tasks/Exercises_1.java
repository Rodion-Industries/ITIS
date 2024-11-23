// № 1
import java.util.Scanner;
public class Exercises_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		System.out.println(var1+var2);
	}
}

// № 2
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double var1 = sc.nextDouble();
		double var2 = sc.nextDouble();
		if (var1 == var2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

// № 3
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= b) {
			a = 0;
		}
		System.out.println(a+" "+b);
	}
}

// № 4
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > 0) {
			a = a*a;
		}
		if (b > 0) {
			b = b*b;
		}
		if (c > 0) {
			c = c*c;
		}
		System.out.println(a+" "+b+" "+c);
	}
}

// № 5
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int summ = 0;
		int num = sc.nextInt();
		while (num != 0) {
			summ += (num%10);
			num /= 10;
		}
		System.out.println(summ);
	}
}

// № 6
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > 1 && a < 3) {
			System.out.println(a);
		}
		if (b > 1 && b < 3) {
			System.out.println(b);
		}
		if (c > 1 && c < 3) {
			System.out.println(c);
		}
	}
}

// № 7
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(i+"*"+k+"="+(k*i));
		}
	}
}

// № 8
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a<=b && b<= c && c<=d) {
			a = d;
			b = d;
			c = d;
			System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
		}
		else if (a>b && b>c && c>d) {
			System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
		}
		else {
			System.out.println("a="+a*a+" b="+b*b+" c="+c*c+" d="+d*d);
		}
	}
}

// № 9 a), б)
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =  sc.nextInt();
		int y =  sc.nextInt();
		int z =  sc.nextInt();

		

		if ((x+y) > z && (x+z) > y && (y+z) > x) {
			System.out.println("Треугольник существует!)");
			int min = x;
			int max = y;

			if (min > y) {
				min = y;
			}
			if (min > z) {
				min = z;
			}
			
			if (max < x) {
				max = x;
			}
			if (max < z) {
				max = z;
			}
			int sred = (x+y+z)-max-min;
			int var1 = (min*min + sred*sred);
			System.out.println(min+" "+sred+" "+max);
			if (max*max < var1) {
				System.out.println("Треугольник остроугольный");
			}
			else if (max*max == var1) {
				System.out.println("Треугольник прямоугольный");
			}
			else {
				System.out.println("Треугольник тупоугольный");
			}

		}
		else {
			System.out.println("Треугольника не существует!(");
		}
	}
}


// № 10
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();


		if (x!=y && y!=z) {
			int min = x;
			int max = y;
			if (min > y) {
					min = y;
				}
			if (min > z) {
				min = z;
			}
			
			if (max < x) {
				max = x;
			}
			if (max < z) {
				max = z;
			}

			int summ = x+y+z;

			int sred = summ - min - max;


			

			if (summ < 1) {
				if (min == x) {
					System.out.println("min x = "+(sred+max)/2);
				}
				if (min == y) {
					System.out.println("min y = "+(sred+max)/2);
				}
				if (min == z) {
					System.out.println("min z = "+(sred+max)/2);
				}
				
			}
			else {
				if (x < y) {
					x = (y+x)/2;
					System.out.println("x<y -> x = "+x);
				}
				if (x > y) {
					y = (z+x)/2;
					System.out.println("x>y -> y = "+y);
				}
			}
		} else {
			System.out.println("Три числа должны быть попарно различными!");
		}




		
			
	}
			
}

// № 11 
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int d = b*b - 4*a*c;

		if (d < 0) {
			System.out.println("Урав-ие не имеет действительных корней!");
		} else if (d == 1) {
			System.out.println((-1*b)/ (2*a));
		} else {
			System.out.println(((-1*b) + Math.sqrt(d)) / (2*a));
			System.out.println(((-1*b) - Math.sqrt(d)) / (2*a));
		}




			
	}
			
}

// № 12
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		String s = "";

		while (num != 0) {
			if (num % 2 == 0) {
				s += "0";
				num /= 2;
			} else {
				s += "1";
				num = (num - 1) / 2;
			}
		}
		System.out.println(s);



			
	}
			
}

// № 13 
import java.util.Scanner;
public class Exercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		while (n1 < n2) {
			n1 = n2;
			n2 = sc.nextInt();
		}



			
	}
		
}