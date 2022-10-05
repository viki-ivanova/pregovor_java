package ZAD_1_2;

public class Square extends Rectangle implements Comparable<Square>{
	public Square() {
		super();
	}
	public Square(Point p1, Point p2, Point p3, Point p4) {
		super(p1, p2, p3, p4);
	}
	public Square(Square square) {
		this.setP1(square.getP1());
		this.setP2(square.getP2());
		this.setP3(square.getP3());
		this.setP4(square.getP4());
	}
	@Override
	public String toString() {
		return "Square:\n" + getP1() + " " + getP2() + " " + getP3() + " " + getP4();

	}
	@Override
	public int compareTo(Square o) {
		if(this.getArea() > o.getArea()) {
			return -1;
		}
		else if(this.getArea() < o.getArea()) {
			return 1;
		}
		return 0;
	}
	
}