
package p1;

public class Statictest {
	static {
		System.out.println("static执行比main早");
	}

	public static void main(String args[]) {
		System.out.println("main执行比static早");
	}
}// 结果可以看出static执行更快，因为运行main时，要把main方法所在类的代码加载到内存中，需要一定时间 }
