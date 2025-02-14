public class Main {
	public static void main(String[] args) {
		try {
			Dog dog = new Dog(20, "name", "Корги");
			Cat cat = new Cat(14, "cat name", "чёрный");

			// dog.speak();
			// dog.setAge(-23);

			System.out.println(dog.getBreed());

			Animal[] animal = new Animal[3];
			animal[0] = new Dog(30, "Name", "breed");
			animal[1] = new Cat(23, "cat name2", "color");
			animal[2] = new Dog(12, "name dog", "breed2");

			for (Animal animal1 : animal) {
				animal1.speak();
			}
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

		






	}
}