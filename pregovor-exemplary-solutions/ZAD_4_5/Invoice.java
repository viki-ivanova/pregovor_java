package ZAD_4_5;

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}

	public Invoice() {
		setPartNumber("");
		setPartDescription("");
		setQuantity(0);
		setPricePerItem(0);
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
		if (quantity < 0)
			throw new IllegalArgumentException("quantity should be > 0");
		else
			this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) throws IllegalArgumentException {
		if (pricePerItem < 0)
			throw new IllegalArgumentException("Price per item should be > 0");
		;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		return "Invoice:\npartNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}

}