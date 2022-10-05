package zad_2;

public class ComparableSquare extends Square implements Comparable<ComparableSquare> {

	public ComparableSquare(double[] sides) {
		super(sides);
	}

	@Override
	public int compareTo(ComparableSquare o) {
		if (this.area() > o.area()) {
			return 1;
		} else if (this.area() == o.area()) {
			return 0;
		} else
			return -1;
	}
}
