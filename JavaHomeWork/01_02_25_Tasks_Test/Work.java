public class Work {
	public static void main(String[] args) {
		FullTimeEmployee fulltimeemployee = new FullTimeEmployee("Вася", 1, "FullStack", 5000, 21, true);
		PartTimeEmployee parttimeemployee = new PartTimeEmployee("Иван", 2, "Backend", 3000, 20, 50);

		System.out.println(fulltimeemployee.getEmployeeInfo());
		System.out.println();
		System.out.println(parttimeemployee.getEmployeeInfo());
	}
}