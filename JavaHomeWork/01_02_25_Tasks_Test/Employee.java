// необязательно прописывать мидификатор для классов (атрибуты и методы в основном)
abstract class Employee {
    // атрибуты
    private String name;
    private int id;
    private String position;
    private double salary;

    // конструктор
    public Employee(String name, int id, String position, double salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    // геттер 
    public String getName() {
        return name;
    }

    // сеттер (переопределение и валидация данных)
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateAnnualSalary();

    public abstract String getEmployeeInfo();
}


// Разобрать основные принципы ООП (чем отличается функция от метода класса, что такое аттрибуты, объекты класса, this. )
// Геттеры, сеттеры 
// Модификаторы доступа
// Наследования и свойства наследований
// super()
// Как работают интерфейсы
// Перегрузка методов