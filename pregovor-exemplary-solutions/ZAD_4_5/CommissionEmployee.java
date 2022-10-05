package ZAD_4_5;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}

	public CommissionEmployee() {
		super();
		setGrossSales(1);
		setCommissionRate(0.001);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0)
			throw new IllegalArgumentException("gross sales should be > 0");
		else
			this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate < 0 || commissionRate > 1)
			throw new IllegalArgumentException("commission rate should be between 0 and 1");
		else
			this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return super.toString().replaceAll("Employee", "CommissionEmployee") + ", grossSales=" + grossSales
				+ ", commissionRate=" + commissionRate;
	}

	@Override
	public double getPaymentAmount() {
		return commissionRate * grossSales;
	}

}