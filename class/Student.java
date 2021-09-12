package p1;

public class Student {
	private String name;
	private String sex;
	private int age;
	private String id;
	private int classId;
	private int englishScores;
	private int mathScores;
	private int height;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getClassId() {
		return classId;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getEnglishScores() {
		return englishScores;
	}

	public void setEnglishScores(int englishScores) {
		this.englishScores = englishScores;
	}

	public int getMathScores() {
		return mathScores;
	}

	public void setMathScores(int mathScores) {
		this.mathScores = mathScores;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		return "姓名；" + name + ", 性别；" + sex + ", 年龄；" + age + ", 学号；" + id + ", 班号；" + classId + ", 英语成绩；"
				+ englishScores + ", 数学成绩；" + mathScores + ", 身高；" + height;
	}

	public static void main(String args[]) {
		Student s = new Student();
		s.setName("张三");
		s.setSex("女");
		s.setAge(19);
		s.setId("2010001");
		s.setClassId(12001);
		s.setEnglishScores(120);
		s.setMathScores(109);
		s.setHeight(165);
		System.out.println(s);
	}
}
