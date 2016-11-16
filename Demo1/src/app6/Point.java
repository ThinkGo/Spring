package app6;

public class Point {
	private int x;
	private int y;
	
	public Point() {
	}
	public String toString() {
		return "Point = ("+getX()+", "+getY()+")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}