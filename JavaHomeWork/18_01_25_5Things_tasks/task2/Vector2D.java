// двумерный вектор
class Vector2D {
	// 2 атрибута (вещественные числа: координаты X и Y)
	private double x;
	private double y;

	// конструктор вектора с координатами
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// конструктор для нулевого вектора (он вызывает другой конструктор этого же класса, который принимает два параметра)
	public Vector2D() {
		this(0.0, 0.0);
	}

	// геттер для x
	public double getX() {
		return x;
	}

	// геттер для y
	public double getY() {
		return y;
	}

	// сеттер для x
	public void setX(double x) {
		this.x = x;
	}

	// сеттер для y
	public void setY(double y) {
		this.y = y;
	}

	// МЕТОД сложения двух векторов, результат возвращается как новый объект
	// Vector2D как новый тип данных
	public Vector2D add(Vector2D other) {
		return new Vector2D(this.x + other.x, this.y + other.y);
	}

	// изменение текущего вектора
	public void add2(Vector2D other) {
		this.x += other.x;
		this.y += other.y;
	}

	// вычитание векторов, создается новый объект
	public Vector2D sub(Vector2D other) {
		return new Vector2D(this.x - other.x, this.y - other.y);
	}

	// то же самое, только не содаётся новый объект, изменяется текущий
	public void sub2(Vector2D other) {
		this.x -= other.x;
		this.y -= other.y;
	}

	// умножение вектора на скаляр, содаётся новый объект
	public Vector2D mult(double multiplier) {
		return new Vector2D(this.x * multiplier, this.y * multiplier);
	}

	// то же самое, только не содаётся новый объект, изменяется текущий
	public void mult2(double multiplier) {
		this.x *= multiplier;
		this.y *= multiplier;
	}

	// строковое представление вектора
	public String toString() {
		return "Vector2D (" + x + ", " + y + ")";
	}

	// нахождение длины вектора
	public double length() {
		return Math.sqrt(x*x + y*y);
	}	

	// нахождение скалярного произведения векторов
	public double scalarProduct(Vector2D other) {
		return this.x * other.x + this.y * other.y;
	}

	// нахождение косинуса
	public double cos(Vector2D other) {
		double length1 = this.length();
		double length2 = other.length();
		if (length1 == 0 || length2 == 0) {
			throw new IllegalArgumentException("нельзя определитель косинус для нулевого вектора");
		}
		return scalarProduct(other) / (length1 * length2);
	}

	// сравнение двух векторов 
	public boolean equals(Vector2D other) {
		return this.x == other.x && this.y == other.y; 
	}	
}