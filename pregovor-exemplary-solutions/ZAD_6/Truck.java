package ZAD_6;

import java.io.Serializable;

public class Truck extends Car implements Serializable {
	private int tonnage;

	public Truck(String brand, int year, int mileage, double value, int tonnage) {
		super(brand, year, mileage, value);
		this.tonnage = tonnage;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public double getPrice() {
		if (getCurrentYear() - getYear() <= 3)
			return getValue();
		else if (tonnage <= 5)
			return getValue() * 0.3;
		else if (tonnage <= 10)
			return getValue() * 0.6;
		return getValue() * 0.8;
	}

}