package ZAD_6;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		File file = new File("data.txt");
		Stack<Car> cars = new Stack<Car>();
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			int type = Integer.parseInt(input.next());
			if (type == 1)
				cars.add(new Car(input.next(), input.nextInt(), input.nextInt(), input.nextDouble()));
			else
				cars.add(
						new Truck(input.next(), input.nextInt(), input.nextInt(), input.nextDouble(), input.nextInt()));
		}
		input.close();

		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("data.dat"));

		while (!cars.empty()) {
			System.out.println(cars.peek());
			output.writeObject(cars.pop());
		}
		output.close();

		/* Another way to write all objects in binary file: */

		/*
		 * output.writeObject(cars); while (!cars.empty()) {
		 * System.out.println(cars.pop()); }
		 * 
		 * output.close();
		 */

		// Check if the binary file is OK
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.dat"));
		try {
			while (true) {
				System.out.println(in.readObject());
			}

		} catch (EOFException e) {
			System.out.println("End of file");
		}
		in.close();

		/*
		 * Stack<Car> carsFromFile = (Stack<Car>)in.readObject(); while
		 * (!carsFromFile.empty()) { System.out.println(carsFromFile.pop()); }
		 */

	}
}