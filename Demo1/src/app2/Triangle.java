package app2;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point a, Point b, Point c) {
		this.pointA = a;
		this.pointB = b;
		this.pointC = c;
	}

	public void draw() {
		System.out.println(pointA+" - "+pointB+" - "+pointC);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

}
