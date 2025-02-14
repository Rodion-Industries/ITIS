// первый дочерний класс Гитара (Guitar)
class Guitar extends MusicalInstrument {
	// с помощью enum(-а) создаём определённый тип данных TypeOfGuitar, который, скажем так, хранит характеристику гитары: либо она классическая, либо бассовая, либо же маленькая, то есть укулеле
	// (грубо говоря) это и есть атрибут
	public TypeOfGuitar type;

	// первый конструктор (с помощью super() наследуем все, что было в родительском классе)
	public Guitar(String manufacturer, double price) {
		super(manufacturer, price);
	}

	// второй конструктор (который использует первый, то есть верхний в этом же классе)
	public Guitar(String manufacturer, double price, TypeOfGuitar type)  {
		this(manufacturer, price);
		this.type = type;
	}

	// реализация Абстрактного родительского метода
	@Override
	public void tuning() {
		System.out.println("Настройка гитары прошла успешно!");
	}

	// переопределение НЕабстрактного родительского метода
	@Override
	public String play() {
		return "Трун";
	}

	// собственный метод
	public String tapping() {
		return "Немного фингер-стайла) - совмещённая игра на гитаре с боем пальцами по корпусу";
	}

	@Override
	public String displayInfo() {
		return "Производитель: " + manufacturer + "\t" + "Цена: " + price + "\t" + "Тип: " + type;
	}
}