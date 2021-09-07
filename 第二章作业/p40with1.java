package p1;
import java.util.Scanner;
public class p40with1{
	public static void main(String[] args) {
		System.out.println("请输入出生年份：");
		int i,j;
		Scanner scan=new Scanner (System.in);
		int year=scan.nextInt();
		for(i=0,j=0;i<=100;i++,year++) {
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) 
					j++;
					else  
						continue;
				}else 
					j++;
			}else
				continue;
		}
		System.out.print("他一生能过"+j+"个闰年");
	}
}