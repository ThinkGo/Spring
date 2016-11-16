package app3;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public void initM1(){
		System.out.println("initM1");
	}
	public void destroyM2(){
		System.out.println("destroyM2");
	}

	public Triangle() {
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
