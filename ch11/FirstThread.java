
public class FirstThread extends Thread {
	private String name;

	public FirstThread(String name) {
		super(name);
		System.out.println(name + "创建成功");
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "第" + i + "次运行");
			// 线程1和线程2运行的时候顺序是不一定的
			/* Thread.yield(); */
		}
	}

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread("第一个线程");
		FirstThread t2 = new FirstThread("第二个线程");
		System.out.println("开始启动t1、t2线程");
		t1.start();
		t2.start();
		System.out.println("main方法运行完毕");
	}
}

/*
 * 第一个线程创建成功 第二个线程创建成功 开始启动t1、t2线程 main方法运行完毕 第一个线程第0次运行 第一个线程第1次运行 第二个线程第0次运行
 * 第一个线程第2次运行 第二个线程第1次运行 第二个线程第2次运行
 */
/*
 * 如果把第22.23的start改成run会变成 第一个线程创建成功 第二个线程创建成功 开始启动t1、t2线程 main第0次运行 main第1次运行
 * main第2次运行 main第0次运行 main第1次运行 main第2次运行 main方法运行完毕
 */
