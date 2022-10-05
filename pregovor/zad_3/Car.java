package zad_3;

public class Car implements CarbonFootprint {
	private Fuel fuelType;
	private int distance;

	public Car() {
	}

	public Car(Fuel fuelType, int distance) {
		this.fuelType = fuelType;
		this.distance = distance;
	}

	public Car(Car c) {
		this.fuelType = c.fuelType;
		this.distance = c.distance;
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Car{" + "fuelType=" + fuelType + ", distance=" + distance + '}';
	}

	@Override
	public double getCarbonFootprint() {
		double EF;
		switch (fuelType) {
		case CNG -> EF = 0.05444;
		case Diesel -> EF = 10.21;
		case LPG -> EF = 5.68;
		case Motor_Gasoline -> EF = 8.78;
		default -> EF = 1;
		}
		return distance * EF;
	}
}
