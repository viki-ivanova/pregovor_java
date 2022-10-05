package zad_6;

public class Truck extends Car {
	private int tonnage;

	public Truck() {
	}

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
	public double price() {
		if ((2022 - super.getYear()) <= 5)
			return super.getValue();
		else if ((2022 - super.getYear()) > 5 && tonnage <= 5)
			return (30 * super.getValue()) / 100;
		else if ((2022 - super.getYear()) > 5 && tonnage <= 10)
			return (60 * super.getValue()) / 100;
		else
			return (80 * super.getValue()) / 100;
	}
}
