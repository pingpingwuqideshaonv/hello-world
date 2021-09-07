package p1;
public class p40with2 {
		public static void main(String[] args) {
			int i=10,t,a=1,b=1;
			if(i==1)
				{t=1;
			System.out.print(t+"   ");
			}
			else if(i==2) {
					t=1;
			System.out.print(t+"   ");}
			else{
				System.out.print("1   1   ");
				for(i=3;i<=10;i++) {
				t=a+b;
				a=b;
				b=t;
				System.out.print(t+"   ");
				}
			}
		}
	}
