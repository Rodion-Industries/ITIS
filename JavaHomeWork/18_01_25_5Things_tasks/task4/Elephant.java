class Elephant implements Animal {
	private int age;
	private String name;
	private String foodType;

	public Elephant(String name, int age, String foodType) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void playWater() {
		System.out.println("Слон играет с водой )");
	}

	@Override
	public void makeSound() {
		System.out.println("Слон трубит!");
	}

	@Override
	public void eat(String foodType) {
		System.out.println("Слон ест: " + foodType);
	}

	public String toString() {
		return "Классификация: слон " + ", Имя: " + name + ", Возраст: " + age; 
	}

	
}