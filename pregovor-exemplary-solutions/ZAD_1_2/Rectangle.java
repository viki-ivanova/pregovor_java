package ZAD_1_2;

public class Rectangle extends GeometricObject {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	public Rectangle() {
		setP1(new Point(0,0));
		setP2(new Point(1,0));
		setP3(new Point(1,1));
		setP4(new Point(0,1));
	}
	
	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		setP1(p1);
		setP2(p2);
		setP3(p3);
		setP4(p4);
	}
	
	public Rectangle(Rectangle rectangle) {
		setP1(rectangle.getP1());
		setP2(rectangle.getP2());
		setP3(rectangle.getP3());
		setP4(rectangle.getP4());
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
	}
	
	@Override
	public double getPerimeter() {
		double side1 = Point.distance(p1, p2);
		double side2 = Point.distance(p2, p3);
		return (side1 + side2)*2;
	}
	
	@Override 
	public double getArea() {
		double side1 = Point.distance(p1, p2);
		double side2 = Point.distance(p2, p3);
		return side1*side2;
	}
	
	@Override
	public String toString() {
		return "Rectangle:\n" + p1.toString() + " " + p2.toString() + " " + p3.toString() + " " + p4.toString();
	}
}