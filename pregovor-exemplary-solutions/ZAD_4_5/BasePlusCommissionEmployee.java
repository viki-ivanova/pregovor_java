package ZAD_4_5;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		setBaseSalary(baseSalary);
	}

	public BasePlusCommissionEmployee() {
		super();
		setBaseSalary(1);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0)
			throw new IllegalArgumentException("base salary should be > 0");
		else
			this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return super.toString().replaceAll("CommissionEmployee", "BasePlusCommissionEmployee") + ", baseSalary="
				+ baseSalary;
	}

	@Override
	public double getPaymentAmount() {
		return super.getPaymentAmount() + baseSalary;
	}
}