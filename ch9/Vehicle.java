import java.util.List;

class Vehicle implements Comparable<Vehicle> {
	private int speed;
	private String color;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor(String color) {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int compareTo(Vehicle v) {
		return this.speed - v.speed;
	}

	public Vehicle(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
}

class Bus extends Vehicle {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Bus(int speed, String color, int price) {
		super(speed, color);
		this.price = price;
	}
}

public class GenericComplex {
	public static <T extends Comparable<T>> T max (List<T> list) {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.size() == 0)
			return null;
		T t = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (t.compareTo(list.get(i)) < 0)
				t = list.get(i);
		}
		return t;
	}

	public static void main(String[]args) {
			List <Integer> list1=new ArrayList<Integer>();
			list1.add(10);
			list1.add(8);
			list1.add(18);
			list1.add(22);
			Integer max=max(list1);
			System.out.println("max="+max);
			List<Vehicle> list2=new ArrayList<Vehicle>();
			list2.add(new Vehicle(80,"blue",1));
			list2.add(new.Vehicle(150,"black",1));
			list2.add(new Vehicle (200,"green",1));
			Bus bus+max(list3);
			System.out.println("max bus:"+bus.getSpeed());
	}
}