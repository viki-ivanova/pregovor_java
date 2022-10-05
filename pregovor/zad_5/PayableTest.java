package zad_5;

import zad_4.Payable;
import zad_4.SalariedEmployee;
import zad_4.Invoice;

public class PayableTest {
	public static void main(String[] args){
		Payable[] payables = new Payable[5];
		payables[0] = new Invoice("0759", "morkov", 4, 0.3);
		payables[1] = new SalariedEmployee("Ceco", "Divoto", "012345", 300);
		payables[2] = new CommissionEmployee("Ceca", "Popova", "67890", 9, 0.9);
		payables[3] = new HourlyEmployee("Ivan", "Vazovski", "24680", 5.5, 41);
		payables[4] = new BasePlusCommissionEmployee("NZ", "VECHE", "99999", 14, 0.7, 4);
		
		for (int i = 0; i < payables.length; i++) {
			System.out.println(payables[i].toString() + "\n" + "payment amount: " + payables[i].getPaymentAmount());
			System.out.println();
		}
	}
}
