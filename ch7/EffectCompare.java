package ch7;

public class EffectCompare {
	public static void main(String[] ages) {
		String string = null;
		StringBuffer stringBuffer = new StringBuffer();
		long startTime1 = System.currentTimeMillis();
		for (int i = 1; i <= 1000; i++) {
			string = string + String.valueOf(i);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("使用String实现循环，程序运行时间为：" + (endTime1 - startTime1) + "毫秒");
		long startTime2 = System.currentTimeMillis();
		for (int i = 1; i <= 1000; i++) {
			stringBuffer = stringBuffer.append(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用StringBuffer实现循环，程序运行时间为：" + (endTime2 - startTime2) + "毫秒");
	}
}
//十万次；string 3922，stringbuffer 4
//五万次；string 1069，stringbuffer 3
//一千次；string 2，stringbuffer 0