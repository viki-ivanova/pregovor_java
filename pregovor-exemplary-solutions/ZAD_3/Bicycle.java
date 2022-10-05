package ZAD_3;

public class Bicycle implements CarbonFootprint{
	private String owner;
	private String brand;
	
	public Bicycle(String owner, String brand) {
		this.owner = owner;
		this.brand = brand;
	}
	
	public Bicycle() {
		this.owner = "";
		this.brand = "";
	}
	
	public Bicycle(Bicycle b) {
		this.owner = new String(b.getOwner());
		this.brand = new String(b.getBrand());
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Bicycle:\nOwner: " + owner + ", brand: " + brand;
	}

	@Override
	public double getCarbonFootprint() {
		return 0;
	}
	
}