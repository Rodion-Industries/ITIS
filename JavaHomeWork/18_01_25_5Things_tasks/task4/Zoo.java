class Zoo {
	// массив типа Animal
	private Animal[] animals;
	private int count;

	// конструктор
	public Zoo(int capacity) {
		animals = new Animal[capacity];
		// кол-во животных в зоопарке
		count = 0;
	}

	public void addAnimal(Animal animal) {
		if (count < animals.length) {
            animals[count++] = animal;
            System.out.println("+ Ваше животное добавлено в Зоопарк");
        } else {
            System.out.println("! Зоопарк полон, нельзя добавить больше животных");
        }
	}

	public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }

    public void feedAll() {
        for (int i = 0; i < count; i++) {
        	// Получаем тип пищи для животного
            String foodType = animals[i].getFoodType();
            // Передаем в eat тип пищи для этого животного
            animals[i].eat(foodType);
        }
    }
}