package zad_4;

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice() {
	}

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;

	}

	public void setQuantity(int quantity) {
		if (quantity > 0)
			this.quantity = quantity;
		else
			throw new IllegalArgumentException("Quantity should be a positive integer!");
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0)
			this.pricePerItem = pricePerItem;
		else
			throw new IllegalArgumentException("Item's price should be a positive number!");
	}

	@Override
	public String toString() {
		return "Invoice" + "\n" + "{" + "part number: " + partNumber + "\n" + "part description: " + partDescription + "\n"
				+ "quantity: " + quantity + "\n" + "price per item: " + pricePerItem + '}';
	}

	@Override
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}
}
