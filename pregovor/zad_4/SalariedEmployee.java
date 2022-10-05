package zad_4;

public class SalariedEmployee extends Employee implements Payable {
	private double weeklySalary;

	public SalariedEmployee() {
	}

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary > 0)
			this.weeklySalary = weeklySalary;
		else
			throw new IllegalArgumentException("The weekly salary cannot be a negative number!");
	}

	@Override
	public String toString() {
		return "Salaried employee" + "\n" + "{" + super.getFirstName() + " " + super.getLastName() + "\n" + "SSN: "
				+ super.getSocialSecurityNumber() + "\n" + "weekly salary: " + weeklySalary + '}';
	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}
}
