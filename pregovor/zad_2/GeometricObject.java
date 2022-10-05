package zad_2;

public abstract class GeometricObject {
	double sides[];

	public abstract void create(int points[][]);

	public abstract double area();

	public abstract String info();

	public double perimeter() {
		double p = 0;
		for (int i = 0; i < sides.length; i++) {
			p += sides[i];
		}
		return p;
	}

	double distanceBetweenPoints(int x1, int y1, int x2, int y2) {
		double a = Math.abs(x1 - x2), b = Math.abs(y1 - y2);
		return Math.sqrt(a * a + b * b);
	}

	public double[] getSides() {
		return sides;
	}

	public void setSides(double[] sides) {
		this.sides = sides;
	}
}
