public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(String name, int id, String position, double salary, int hoursWorked, double hourlyRate) {
		super(name, id, position, salary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

	@Override
	public double calculateAnnualSalary() {
		return 12 * getSalary();
	}

	@Override
	public String getEmployeeInfo() {
		return "Имя сотрудника: " + getName() + "\n" + "ID: " + getId() + "\n" + "Должность: " + getPosition() + "\n" + "Зарплата: " + getSalary();
	}

	public double calculatePieceWorkSalary() {
		return hourlyRate * hoursWorked;
	}
	

}