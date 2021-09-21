package p1;

public class Manager extends Worker {
	private double allowance;
	private double wage;

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public Manager(String name, double wage, double allowance) {
		super(name, wage);
		this.allowance = allowance;
	}

	public void increase() {
		this.wage = this.wage + 300;
		this.allowance = this.allowance + 200;
	}

	public void print() {
		System.out.println(getName() + "wage:" + wage);
		System.out.println(getName() + "super wage:" + super.getWage());
		System.out.println(getName() + "allowance:" + allowance);
	}

	public static void main(String args[]) {
		Worker w1 = new Worker("张三", 2000);
		w1.increase();
		w1.print();
		Manager w2 = new Manager("李四", 2000, 500);
		w2.increase();
		w2.print();
		Worker w3 = new Manager("王五", 2000, 500);// 父类引用指向子类对象，从输出结果可以明显看出这个是调用子类的函数
		w3.increase();
		w3.print();
	}
}
