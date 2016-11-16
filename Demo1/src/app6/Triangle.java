package app6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean

{
	public Triangle() {
		System.out.println("0\tDEFAULT CONSTRUCTOR Triangle");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("1\tafterPropertiesSet() called :: InitializingBean interface method: afterPropertiesSet ");
	}

	public void myInit() {
		System.out.println("2\tmyInit() is called :: custom method defined in beans tag default-init-method=\"myInit\"");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("3\tdestroy() is called :: DisposableBean destroy");
	}

	public void myDestroy() {
		System.out.println("4\tmyDestroy() is called :: default-destroy-method=\"myDestroy\" ");
	}

	public void draw() {
		System.out.println("-\tcalling biz method " + pointA + " - " + pointB + " - " + pointC);
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
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
}
