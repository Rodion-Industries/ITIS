public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(3);

		Lion lion1 = new Lion("Лёва", 7, "мясо");
		Elephant elephant1 = new Elephant("Вася", 3, "яблоко");
		Monkey monkey1 = new Monkey("Борька", 4, "банан");
		Monkey monkey2 = new Monkey("Кира", 2, "манго");


		zoo.addAnimal(lion1);
        zoo.addAnimal(elephant1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey2);
        System.out.println();

        zoo.makeAllSounds();
        System.out.println();

        zoo.feedAll();
        System.out.println();

        System.out.println(lion1.toString());
        System.out.println(elephant1.toString());
        System.out.println(monkey1.toString());
        System.out.println(monkey2.toString());
        System.out.println();

        lion1.hunt();
        elephant1.playWater();
        monkey1.swing();

	}
}