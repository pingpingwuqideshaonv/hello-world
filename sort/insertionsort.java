package p1;

public class insertionsort {
	public static void sort(int[] array) {
		if (null == array || 1 == array.length) {
			return;
		}

		for (int i = 1; i < array.length; i++) {
			int insertValue = array[i];// 暂存需要插入元素
			int j = i - 1;
			for (; j >= 0 && insertValue < array[j]; j--) {
				array[j + 1] = array[j];
			}

			array[j + 1] = insertValue;
		}
	}

	public static void main(String args[]) {
		int[] b = new int[] { 11, 34, 1, 169, 75, 88, 12 };
		sort(b);
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + "   ");
	}
}