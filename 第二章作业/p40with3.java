package p1;


	import java.util.Scanner;
	public class p40with3 {
		public static void main(String[] args) {
			Scanner scan=new Scanner (System.in);
			System.out.println("请输入第一个正整数：");
			int i =scan.nextInt();
			System.out.println("请输入第二个正整数：");
			int j =scan.nextInt();
			int t;
			if(i<j)
				{
			t=i;
			i=j;
			j=t;}
			t=i%j;
			if(t==0)
				i=j;
			while(t!=0) {
			t=i%j;
			i=j;
			j=t;
			}
			System.out.println("最大公约数是："+i);
			}
		}
	