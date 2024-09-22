package DatosTrabajadores;

public class Employee {

	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}
	
	public Employee(String firstName, String lastName, int registration) {
		this(firstName, lastName, registration, 10, 20, 0, 90, 1);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}

	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
	public int timeToRetirement() {
		int ToRetirement= Math.min(60 - this.age, 40 - this.yearsWorked);
		return ToRetirement;
		
	}
	
	public int vacationTimeLeft() {
		final int TOTAL_WORK_DAYS = 360;
		double vacationLeft = ((double) this.daysWorked / TOTAL_WORK_DAYS) * (30 - this.vacationDaysTaken);
	
		return (int)vacationLeft;
	}
	
	public double calculateBonus() {
		double bonus = 2.2 * this.salary;
		return bonus;
	}
	
	@Override
	public String toString() {
		return "Primer nombre=" + firstName + ", Apellido=" + lastName + ", Registro=" + registration
				+ ", Años=" + age + ", Días trabajados=" + daysWorked + ", Días de vacaiones tomados=" + vacationDaysTaken
				+ ", Salario=" + salary + ", Años trabajados=" + yearsWorked + "]";
	}
	
	
}