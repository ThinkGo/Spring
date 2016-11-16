package app4;

import java.util.List;

public class Triangle {

	private List<Point> points ;


	public Triangle() {
	}
	
	public void draw(){
		for (Point point: points) {
			System.out.println(point);
		}
	}


	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}

}
