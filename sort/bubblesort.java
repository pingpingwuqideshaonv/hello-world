package p1;

public class bubblesort {
	public static void sort(int a[]) {
		int t = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
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