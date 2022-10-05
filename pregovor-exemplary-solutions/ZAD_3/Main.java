package ZAD_3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();		
		list.add(new Building(10000.5, 0, 5.2, 10.3));
		list.add(new Car(FuelType.LPG, 100));
		list.add(new Bicycle("Ivan", "BMX"));
		
		for(CarbonFootprint object : list) {
			System.out.println(object.toString() + " carbon footprint: " + object.getCarbonFootprint());
		}
	}
}