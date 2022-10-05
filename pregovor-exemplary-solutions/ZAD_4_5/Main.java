package ZAD_4_5;

public class Main {

	public static void main(String[] args) {
		Invoice i = new Invoice("Invoice1", "12-3", 5, 10.2);
		SalariedEmployee s = new SalariedEmployee("Ivan", "Petrov", "123", 120);
		CommissionEmployee c = new CommissionEmployee("Petar", "Ivanov", "456", 12, 0.5);
		HourlyEmployee h = new HourlyEmployee("Stefan", "Stefanov", "789", 18, 100);
		BasePlusCommissionEmployee b = new BasePlusCommissionEmployee("Gergi", "Georgiev", "101", 18, 0.7, 1000);
		Payable[] payables = new Payable[5];
		payables[0] = i;
		payables[1] = s;
		payables[2] = c;
		payables[3] = h;
		payables[4] = b;

		for (Payable p : payables) {
			System.out.println(p + ", paymentAmount=" + p.getPaymentAmount());
		}
	}

}