package ZAD_3;

public class Car implements CarbonFootprint {
	FuelType fuelType;
	private double distance;
	
	public Car(FuelType fuelType, double distance) {
		this.fuelType = fuelType;
		this.distance = distance;
	}
	
	public Car() {
		this.fuelType = FuelType.CNG;
		this.distance = 0;
	}
	
	public Car (Car c) {
		this.fuelType = c.getFuelType();
		this.distance = c.getDistance();
	}
	
	public FuelType getFuelType() {
		return fuelType;
	}
	
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "Car:\nFuel type: " + fuelType + ", distance: " + distance;
	}
	@Override
	public double getCarbonFootprint() {
		switch(fuelType) {
			case CNG:
				return distance * 0.05444;
				
			case Diesel:
				return distance * 10.21;
				
			case LPG:
				return distance * 5.68;
				
			case MotorGasoline:
				return distance * 8.78;
				
			default:
				return -1;
		}
	}
	
}
