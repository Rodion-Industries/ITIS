public class FullTimeEmployee extends Employee implements Reportable {
	private int vacationDays;
	private boolean hasMedicalInsurance;

	public FullTimeEmployee(String name, int id, String position, double salary, int vacationDays, boolean hasMedicalInsurance) {
		super(name, id, position, salary);
		this.vacationDays = vacationDays;
		this.hasMedicalInsurance = hasMedicalInsurance;
	}

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public boolean getHasMedicalInsurance() {
        return hasMedicalInsurance;
    }

    public void setHasMedicalInsurance(boolean hasMedicalInsurance) {
        this.hasMedicalInsurance = hasMedicalInsurance;
    }

	@Override
	public double calculateAnnualSalary() {
		return 12 * getSalary();
	}

	@Override
	public String getEmployeeInfo() {
		return "Имя сотрудника: " + getName() + "\n" + "ID: " + getId() + "\n" + "Должность: " + getPosition() + "\n" + "Зарплата: " + getSalary();
	}

	public void leaveVacation(int days) {
		this.vacationDays -= days;
	}

	@Override
	public String generateReport() {
		return getEmployeeInfo() + "\n" + "Кол-во отпускных дней: " + vacationDays + "\n" + "Наличие мед. страховки: " + hasMedicalInsurance;
	}

}