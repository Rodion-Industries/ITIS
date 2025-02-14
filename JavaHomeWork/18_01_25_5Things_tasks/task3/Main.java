public class Main {
	public static void main(String[] args) {
		try {
			RationalFraction frac1 = new RationalFraction(8, 12);
			RationalFraction frac2 = new RationalFraction(45, 0);

			System.out.print("Скоращённая дробь frac1 = " + frac1.toString() + ": ");
			frac1.reduce();
			System.out.println(frac1.toString());

			System.out.print("Скоращённая дробь frac2 = " + frac2.toString() + ": ");
			frac2.reduce();
			System.out.println(frac2.toString());
			System.out.println();

			System.out.print("Сумма frac3 = frac1 + frac2 = " + frac1.toString() + " + " + frac2.toString() + " = ");
			RationalFraction frac3 = frac1.add(frac2);
			System.out.println(frac3.toString());

			// запишем в дробь frac1 сумму frac1 и frac2
			System.out.print("frac1 = frac1 + frac2 = " + frac1 + " + " + frac2 + " = ");
			frac1.add2(frac2);
			System.out.println(frac1.toString());
			System.out.println();

			//разность дробей - ответ записывается как новый объект frac4
			System.out.print("Разность frac4 = frac1 - frac2 = " + frac1.toString() + " - " + frac2.toString() + " = ");
			RationalFraction frac4 = frac1.sub(frac2);
			System.out.println(frac4.toString());

			// запишем в frac2 = frac2 - frac1
			System.out.print("frac2 = frac2 - frac1 = " + frac2 + " - " + frac1 + " = ");
			frac2.sub2(frac1);
			System.out.println(frac2.toString());
			System.out.println();

			System.out.print("Умножение дробей frac5 = frac1 * frac2 = " + frac1 + " * " + frac2 + " = ");
			RationalFraction frac5 = frac1.mult(frac2);
			System.out.println(frac5.toString());

			// Запишем в frac1 = frac1 * frac3
			System.out.print("frac1 = frac1 * frac3 = " + frac1 + " * " + frac3 + " = ");
			frac1.mult2(frac3);
			System.out.println(frac1.toString());
			System.out.println();

			System.out.print("Деление дробей frac1 / frac3 = " + frac1 + " / " + frac3 + " = ");
			RationalFraction frac6 = frac1.div(frac3);
			System.out.println(frac6.toString());

			// Запишем в frac1 = frac1 / frac4
			System.out.print("frac1 = frac1 / frac4 = " + frac1 + " / " + frac4 + " = ");
			frac1.div2(frac4);
			System.out.println(frac1.toString());
			System.out.println();

			System.out.println("Дестичная запись дроби: " + String.format("%.2f", frac1.value()));

			System.out.println("Верно ли, что frac1 = frac5? Ответ: " + frac1.equals(frac5) + ", так как frac1 = " + frac1 + ", frac5 = " + frac5);

			System.out.println("frac1 = " + frac1 + " Целая часть этой дроби = " + frac1.numberPart());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			// return нужен для завершения программы (получить ошибку, вывести ее в консоль и прервать все действия)
			return;
		}
		

	}
}