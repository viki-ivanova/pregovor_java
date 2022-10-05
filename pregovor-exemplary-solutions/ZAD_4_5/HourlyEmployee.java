package ZAD_4_5;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}

	public HourlyEmployee() {
		super();
		setWage(1);
		setHours(1);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0)
			throw new IllegalArgumentException("wage should be > 0");
		else
			this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours < 0 || hours > 168)
			throw new IllegalArgumentException("hours should be between 0 and 168");
		else
			this.hours = hours;
	}

	@Override
	public String toString() {
		return super.toString().replaceAll("Employee", "HourlyEmployee") + ", wage= " + wage + ", hours= " + hours;
	}

	@Override
	public double getPaymentAmount() {
		if (hours <= 40)
			return wage * hours;
		else
			return 40 * wage + (hours - 40) * wage * 1.5;
	}

}