package zad_5;

import zad_4.Employee;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee() {
	}

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours > 0 && hours <= 168)
			this.hours = hours;
		else
			throw new IllegalArgumentException("Hours should be between 0 and 169!");
	}

	public void setWage(double wage) {
		if (wage > 0)
			this.wage = wage;
		else
			throw new IllegalArgumentException("Wage should be a positive number!");
	}

	@Override
	public String toString() {
		return "Hourly employee" + "\n" + "{" + super.getFirstName() + " " + super.getLastName() + "\n" + "SSN: "
				+ super.getSocialSecurityNumber() + "\n" + "wage: " + wage + "\n" + "hours: " + hours + '}';
	}

	@Override
	public double getPaymentAmount() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			return 40 * wage + (hours - 40) * wage * 1.5;
		}
	}
}
