package zad_5;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee() {
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 0)
			this.baseSalary = baseSalary;
		else
			throw new IllegalArgumentException("Base salary should be a positive number!");
	}

	@Override
	public String toString() {
		return "Base salaried commission employee" + "\n" + "{" + super.getFirstName() + " " + super.getLastName() + "\n" + "SSN: "
				+ super.getSocialSecurityNumber() + "\n" + "gross sales: " + super.getGrossSales() + "\n" + "commission rate: "
				+ super.getCommissionRate() + "\n" + "base salary: " + baseSalary + '}';
	}

	@Override
	public double getPaymentAmount() {
		return (super.getGrossSales() * super.getCommissionRate()) * baseSalary;
	}
}
