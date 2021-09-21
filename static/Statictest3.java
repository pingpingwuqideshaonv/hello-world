package p1;

public class Statictest3 {
	public static void main(String args[]) {
		int a = 1;
		static int b = 2;
		System.out.print(a + b);
	}
}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: Illegal modifier for parameter b; only final is permitted
//at project1/p1.Statictest3.main(Statictest3.java:6)
