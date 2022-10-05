package zad_2;

public class Square extends GeometricObject {
	private static final int SIDE_COUNT = 4;

	public Square(double sides[]) {
		if (sides.length != SIDE_COUNT || sides[0] != sides[1] || sides[1] != sides[2] || sides[2] != sides[3]) {
			return;
		}
		this.sides = sides;
	}

	public Square() {
	}

	public Square(Square s) {
		this.sides = s.sides;
	}

	@Override
	public void create(int[][] points) {
		if (points.length != SIDE_COUNT) {
			return;
		}
		sides[0] = distanceBetweenPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
		sides[1] = sides[0];
		sides[2] = sides[0];
		sides[3] = sides[0];
	}

	@Override
	public double area() {
		return sides[0] * sides[1];
	}

	@Override
	public String info() {
		return String.format("Side:%.2f\nArea:%.2f, Perimeter:%.2f", sides[0], area(), perimeter());
	}
}
