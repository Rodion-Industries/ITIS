// абстрактный родительский класс
abstract class MusicalInstrument {

	// 2 атрибута
	public String manufacturer;
	public double price;

	// первый конструктор
	public MusicalInstrument(String manufacturer, double price) {
		this.manufacturer = manufacturer;
		this.price = price;
	}

	// второй конструктор (который использвует первый через this()...)
	public MusicalInstrument() {
		this("Unknown", 0.0);
	}

	// первый НЕабстрактный метод
	public String displayInfo() {
		return "Производитель: " + manufacturer + "\n" + "Цена: " + price;
	}

	// второй НЕабстрактный метод
	public String play() {
		return "Как хорошо звучит этот инструмент!";
	}

	// третий Абстрактный метод (без реализации)
	// настройка инструмента
	public abstract void tuning();
}