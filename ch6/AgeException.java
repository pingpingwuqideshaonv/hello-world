package ch6;

public class AgeException extends Exception {
	public AgeException() {// 调用父类的构造方法，将“年龄超过范围”赋值给父类的message变量
		super("年龄超过范围");// 异常错误是固定的
	}

	public AgeException(String message) {// 调用父类的构造方法，把message传递给父类的message变量
		super(message);// 异常错误是由调用者指定的
	}
}
