package zad_5;

import zad_4.Employee;
import zad_4.Payable;

public class CommissionEmployee extends Employee implements Payable{
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee() {
	}

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales > 0)
			this.grossSales = grossSales;
		else
			throw new IllegalArgumentException("Input for gross sales should be a positive integer!");
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0 && commissionRate < 1)
			this.commissionRate = commissionRate;
		else
			throw new IllegalArgumentException("Commission rate should be between 0 and 1!");
	}

	@Override
	public String toString() {
		return "Commission employee" + "\n" + "{" + super.getFirstName() + " " + super.getLastName() + "\n" + "SSN: "
				+ super.getSocialSecurityNumber() + "\n" + "gross sales: " + grossSales + "\n" + "commission rate: "
				+ commissionRate + '}';
	}

	@Override
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}

}
