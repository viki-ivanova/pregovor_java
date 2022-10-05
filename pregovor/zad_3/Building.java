package zad_3;

public class Building implements CarbonFootprint {
	private static final double EF = 0.4374;
	private int electricity;
	private int lpg;
	private int waste;
	private int water;

	public Building() {
	}

	public Building(int electricity, int ipg, int water, int waste) {
		this.electricity = electricity;
		this.lpg = ipg;
		this.water = water;
		this.waste = waste;
	}

	public Building(Building building) {
		this.electricity = building.electricity;
		this.lpg = building.lpg;
		this.water = building.water;
		this.waste = building.waste;
	}

	public int getElectricity() {
		return electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}

	public int getLpg() {
		return lpg;
	}

	public void setLpg(int lpg) {
		this.lpg = lpg;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

	@Override
	public String toString() {
		return "Building{" + "electricity=" + electricity + ", lpg=" + lpg + ", water=" + water + ", waste=" + waste
				+ '}';
	}

	@Override
	public double getCarbonFootprint() {
		return electricity * EF + lpg * EF + waste * 365 * EF + water * 52 * EF;
	}
}