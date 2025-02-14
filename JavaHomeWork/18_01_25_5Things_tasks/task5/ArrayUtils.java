import java.util.Arrays;
class ArrayUtils {
	public static int getSum(int[] array) {
		int summa = 0;
		for (int i = 0; i < array.length; i++) {
			summa += array[i];
		}

		return summa;
	}

	public static double average(int[] array) {
		int summa = 0;
		for (int i = 0; i < array.length; i++) {
			summa += array[i];
		}

		double sr = (double) summa / array.length;
		
		return sr;
	}

	public static int max_value(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		return max;
	}

	public static int min_value(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

	public static int mode(int[] array) {
		int max_count = 0;
		int number = array[0];

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
					if (array[i] == array[j]) {
						count += 1;
					}
			}
			if (count > max_count) {
				max_count = count;
				number = array[i];
			}
		}

		return number;
	}

	public static int[] sort_ascending(int[] array) {
		int[] new_array = Arrays.copyOf(array, array.length);

		int n = new_array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (new_array[j] > new_array[j+1]) {
					int k = new_array[j];
					new_array[j] = new_array[j+1];
					new_array[j+1] = k;
				}
			}
		}

		return new_array;
	}
}