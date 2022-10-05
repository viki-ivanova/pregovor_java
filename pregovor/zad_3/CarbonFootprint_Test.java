package zad_3;

import java.util.ArrayList;
import java.util.List;

public class CarbonFootprint_Test {
	public static void main(String[] args) {
		List<CarbonFootprint> list = new ArrayList<>();
		list.add(new Bicycle("Chochi Pompata", "Balkanche"));
		list.add(new Building(29, 19, 9, 40));
		list.add(new Car(Fuel.LPG, 2300));
		list.forEach(carbonFootprint -> System.out.println(carbonFootprint.getCarbonFootprint()));
	}
}
