package ZAD_1_2;

public class Triangle extends GeometricObject {
	 private Point p1;
	 private Point p2;
	 private Point p3;	
	 
	 public Triangle() {
		 setP1(new Point(0,0));
		 setP2(new Point(0, 1));
		 setP3(new Point(1,0));
	 }

	 public Triangle(Point p1, Point p2, Point p3) {
		 setP1(p1);
		 setP2(p2);
		 setP3(p3);
	 }
	 
	 public Triangle(Triangle triangle) {
		 this.setP1(triangle.getP1());
		 this.setP2(triangle.getP2());
		 this.setP3(triangle.getP3());
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
	
	@Override
	public double getPerimeter() {
		return Point.distance(p1,p2)  + Point.distance(p1,p3) + Point.distance(p2,p3);
	}
	
	@Override
	public double getArea() {
		double side1 = Point.distance(p1,p2);
		double side2 = Point.distance(p1,p3);
		double side3 = Point.distance(p2,p3);
		double p = (side1 + side2 + side3)/2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	
	@Override 
	public String toString() {
		return "Triangle:\n" + p1.toString() + " " + p2.toString() + " " + p3.toString() + " ";
	}
}