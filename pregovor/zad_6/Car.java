package zad_6;

public class Car {
	private String brand;
	private int year;
	private int mileage;
	private double value;

	public Car() {
	}

	public Car(String brand, int year, int mileage, double value) {
		this.brand = brand;
		this.year = year;
		this.mileage = mileage;
		this.value = value;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double price() {
		if ((2022 - year) <= 3)
			return (80 * value) / 100;
		else if ((2022 - year) <= 6)
			return (60 * value) / 100;
		else
			return (30 * value) / 100;
	}
}
