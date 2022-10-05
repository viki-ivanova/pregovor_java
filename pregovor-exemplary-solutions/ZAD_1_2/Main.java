package ZAD_1_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Square square2 = new Square(new Point(0,0), new Point(0,2), new Point (2, 2), new Point(2, 0));
		
		ArrayList<GeometricObject> geometricObjects = new ArrayList<GeometricObject>();
		geometricObjects.add(triangle);
		geometricObjects.add(rectangle);
		geometricObjects.add(square);
		geometricObjects.add(square2);
		
		for(GeometricObject g: geometricObjects) {
			System.out.println(g + " Area: " + g.getArea() + " Perimeter: " + g.getPerimeter());
		}
		
		System.out.println(square.compareTo(square2));
		
	}
}
