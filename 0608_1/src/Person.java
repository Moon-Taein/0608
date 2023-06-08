
public class Person {
	private String name;
	private int age;
	private boolean marry;

	public Person(String name, int age, boolean marry) {
		super();
		this.name = name;
		this.age = age;
		this.marry = marry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarry() {
		return marry;
	}

	public void setMarry(boolean marry) {
		this.marry = marry;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", marry=" + marry + "]";
	}

}
