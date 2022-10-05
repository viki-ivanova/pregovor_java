package ZAD_6;

import java.io.Serializable;
import java.time.LocalDate;

public class Car implements Serializable {
	private String brand;
	private int year;
	private int mileage;
	private double value;
	private static int currentYear = LocalDate.now().getYear();

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

	public int getMileage() {
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

	public static int getCurrentYear() {
		return currentYear;
	}

	@Override
	public String toString() {
		return brand + ": " + mileage + " km, " + String.format("%.2f", getPrice());
	}

	public double getPrice() {
		if (currentYear - year <= 3)
			return value * 0.8;
		else if (currentYear - year <= 6)
			return value * 0.6;
		return value * 0.4;
	}
}