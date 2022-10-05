package ZAD_4_5;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		setWeeklySalary(weeklySalary);
	}

	public SalariedEmployee() {
		super();
		setWeeklySalary(1);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0)
			throw new IllegalArgumentException("weekly salary should be > 0");
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return super.toString().replaceAll("Employee", "SalariedEmployee") + ", weekly salary= " + weeklySalary;
	}
}