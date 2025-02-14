public class Animal {
	private String name;
	private int age;

	public Animal(int age, String name) {
		setAge(age);
		setName(name);
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
		if (age < 0) {
			throw new IllegalArgumentException("Отрицательное значение!");
		}
		this.age = age;
	}


	public void speak() {
		System.out.println("Some sound");
	}






}