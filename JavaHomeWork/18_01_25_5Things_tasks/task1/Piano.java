// второй дочерний класс Пианино (Piano)
class Piano extends MusicalInstrument {
	
	// с помощью enum(-а) создаём определённый тип данных TypeOfPiano, который, скажем так, хранит характеристику пианино: либо оно классическое, либо электронное(синтезатор), либо же цифровое(программа на компьютере)
	// (грубо говоря) это и есть атрибут
	public TypeOfPiano type;

	// первый конструктор (с помощью super() наследуем все, что было в родительском классе)
	public Piano(String manufacturer, double price) {
		super(manufacturer, price);
	}

	// второй конструктор (который использует первый, то есть верхний в этом же классе)
	public Piano(String manufacturer, double price, TypeOfPiano type) {
		this(manufacturer, price);
		this.type = type;
	}

	// реализация Абстрактного родительского метода
	@Override
	public void tuning() {
		System.out.println("Настройка пианино прошла успешно!");
	}

	// переопределение НЕабстрактного родительского метода
	@Override
	public String play() {
		return "Там-Та-Дам";
	}

	// собственный метод
	public String twoPlayers() {
		return "Игра в четре руки - можно играть вдвоём";
	}

	@Override
	public String displayInfo() {
		return "Производитель: " + manufacturer + "\t" + "Цена: " + price + "\t" + "Тип: " + type;
	}
}