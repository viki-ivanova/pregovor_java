package ZAD_3;

public class Building implements CarbonFootprint{
	private double electricity;
	private double lpg;
	private double waste;
	private double water;
	
	public Building(double electricity, double lpg, double waste, double water) {
		this.electricity = electricity;
		this.lpg = lpg;
		this.waste = waste;
		this.water = water;
	}
	
	public Building() {
		this.electricity = 0;
		this.lpg = 0;
		this.waste = 0;
		this.water = 0;
	}
	
	public Building (Building b) {
		this.electricity = b.getElectricity();
		this.lpg = b.getLpg();
		this.waste = b.getWaste();
		this.water = b.getWater();
	}
	public double getElectricity() {
		return electricity;
	}
	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}
	public double getLpg() {
		return lpg;
	}
	public void setLpg(double lpg) {
		this.lpg = lpg;
	}
	public double getWaste() {
		return waste;
	}
	public void setWaste(double waste) {
		this.waste = waste;
	}
	public double getWater() {
		return water;
	}
	public void setWater(double water) {
		this.water = water;
	}
	
	@Override
	public String toString() {
		return "Building:\nElectricity: " + electricity + ", lpg: " + lpg + ", waste: " + waste + ", water: " + water;
	}
	@Override
	public double getCarbonFootprint() {
		final double EF = 0.4374;
		return electricity * EF + lpg * EF + waste * 365 * EF + water * 52 * EF;
	}
}