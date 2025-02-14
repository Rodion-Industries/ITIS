public class Cat extends Animal {
	private String color;
	// конструктор
	public Cat(int age, String name, String color) {
		super(age, name); // super только от родителя (строго в том порядке age, name)
		this.color = color;
	}

	// геттер
	public String getColor() {
		return color;
	}

	// сеттер
	public void setColor(String color) {
		this.color = color;
	}

	// переопределение
	@Override
	public void speak() {
		System.out.println("Meow!");
	}






}