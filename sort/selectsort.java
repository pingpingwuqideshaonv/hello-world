package p1;

public class selectsort {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int t = arr[min];
				arr[min] = arr[i];
				arr[i] = t;
			}
		}
	}

	public static void main(String args[]) {
		int[] b = new int[] { 11, 34, 1, 169, 75, 88, 12 };
		sort(b);
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + "   ");
	}
}
