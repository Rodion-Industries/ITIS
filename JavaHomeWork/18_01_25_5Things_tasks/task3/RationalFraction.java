class RationalFraction {
	// 2 атрибута - числитель и знаменатель
	private int numerator;
	private int denominator;

	// конструктор для дроби со значениями числителя и знаменателя
	public RationalFraction(int numerator, int denominator) {
		 if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю! -> деление на ноль!");
        }
        // Приводим знаменатель к положительному числу (так для удобства)
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
	}


	// конструктор для нулевой дроби
	public RationalFraction() {
		this(0, 1);
	}


	// __________________________________________________________
	// поиск НОД
	public int FindNOD(int a, int b) {
		while (b != 0) {
			int k = b;
			b = a % b;
			a = k;
		}

		int NOD = a;
		return NOD;
	}


	// поиск НОК
	public int FindNOK(int a, int b) {
		int p = FindNOD(a, b);
		int NOK = (a * b) / p;
		return NOK;
	}
	// __________________________________________________________








	// метод по сокращению дроби (изменяет саму дробь, ту, которая этот метод вызывает)
	public void reduce() {
		int NOD = FindNOD(numerator, denominator);
		numerator /= NOD;
		denominator /= NOD;
	}

	// сложение дробей
	public RationalFraction add(RationalFraction other) {
		int a1 = this.numerator;
		int b1 = this.denominator;

		int a2 = other.numerator;
		int b2 = other.denominator;

		int NOD = FindNOD(b1, b2);
		int NOK = (b1 * b2) / NOD;

		RationalFraction rez = new RationalFraction(a1*(NOK/b1) + a2*(NOK/b2), NOK);
		rez.reduce();

		return rez;
	}

	// сложение дроби с другой дробью, результат сохраняется в том, у кого был вызван этот метод 
	public void add2(RationalFraction other) {
		int h = this.denominator;
		int p = other.denominator;

		int NOD = FindNOD(h, p);
		int NOK = (this.denominator * other.denominator) / NOD;

		this.numerator = this.numerator * (NOK / this.denominator) + other.numerator * (NOK / other.denominator);
		this.denominator = NOK;

		// this. - относится к экзмепляру класса RationalFraction (т.е. изменит саму дробь, а не будет создавать новый объект)
		this.reduce();
	}




	// вычитание дробей, дробь сохраняется как новый объект
	public RationalFraction sub(RationalFraction other) {
		int h = this.denominator;
		int p = other.denominator;

		int NOD = FindNOD(h, p);
		int NOK = (this.denominator * other.denominator) / NOD;

		int newNumerator = this.numerator * (NOK / this.denominator) - other.numerator * (NOK / other.denominator);
		int newDenominator = NOK;

		RationalFraction rez = new RationalFraction(newNumerator, newDenominator);
		rez.reduce();
		return rez;
	}

	// вычитание из дроби другой дроби, результат сохраняется в том, у кого был вызван этот метод
	public void sub2(RationalFraction other) {
		int h = this.denominator;
		int p = other.denominator;

		int NOD = FindNOD(h, p);
		int NOK = (this.denominator * other.denominator) / NOD;

		this.numerator = this.numerator * (NOK / this.denominator) - other.numerator * (NOK / other.denominator);
		this.denominator = NOK;

		// this. - относится к экзмепляру класса RationalFraction (т.е. изменит саму дробь, а не будет создавать новый объект)
		this.reduce();
	}

	// умножение дроби на другую дробь, результат возвращается как новый объект (сократить) 
	public RationalFraction mult(RationalFraction other) {
		RationalFraction rez = new RationalFraction(this.numerator * other.numerator, this.denominator * other.denominator);
		rez.reduce();
		return rez;
	}

	// умножение дроби на другую дробь, результат сохраняется
	public void mult2(RationalFraction other) {
		this.numerator = this.numerator * other.numerator;
		this.denominator = this.denominator * other.denominator;

		this.reduce();
	}

	// деление дроби на другую дробь, результат возвращается как новый объект (сократить) 
	public RationalFraction div(RationalFraction other) {
		RationalFraction rez = new RationalFraction(this.numerator * other.denominator, this.denominator * other.numerator);
		rez.reduce();
		return rez;
	}

	//  деление дроби на другую дробь, результат сохраняется
	public void div2(RationalFraction other) {
		this.numerator = this.numerator * other.denominator;
		this.denominator = this.denominator * other.numerator;

		this.reduce();
	}


	// строковое представление дроби
	public String toString() {
		return numerator + "/" + denominator;
	}


	// десятичное значение дроби
	public double value() {
		return (double) numerator / denominator;
	}


	// сравнить дробь с другой дробью
	public boolean equals(RationalFraction other) {
		this.reduce();
		other.reduce();

		return this.numerator == other.numerator && this.denominator == other.denominator;
	}

	//  целая часть дроби
	public int numberPart() {
		return numerator / denominator;
	}

}