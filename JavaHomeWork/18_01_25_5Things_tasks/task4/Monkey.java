class Monkey implements Animal {
	private int age;
	private String name;
	private String foodType;

	public Monkey(String name, int age, String foodType) {
		this.age = age;
		this.name = name;
		this.foodType = foodType;

	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void makeSound() {
		System.out.println("Обезьяна кричит!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void swing() {
		System.out.println("Обезьяна качается на ветвях...");
	}

	@Override
	public void eat(String foodType) {
		System.out.println("Обезьяна ест: " + foodType);
	}

	public String toString() {
		return "Классификация: обезьяна" + ", Имя: " + name + ", Возраст: " + age; 
	}


	
}