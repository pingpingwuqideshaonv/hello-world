package p1;

public class p40with6 {
	public static void main(String args[]) {
		int a[] = new int[20];
		int sum = 0;
		float ave;
		System.out.println("20个随机整数为：");
		for (int i = 0; i < 20; i++) {
			int random_num = (int) (Math.random() * (459 - 77) + 77);
			System.out.print(random_num + "   ");
			a[i] = random_num;
		}
		int max = 0, min = 459;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
			if (min > a[i]) {
				min = a[i];
			}
			sum = sum + a[i];
		}
		ave = sum / 20;
		System.out.println(" ");
		System.out.println("他们中最大的数为:" + max);
		System.out.println("他们中最小的数为:" + min);
		System.out.println("他们的平均数为:" + ave);
		System.out.println("他们的和为:" + sum);
	}
}
