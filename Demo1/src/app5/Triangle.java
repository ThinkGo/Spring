package app5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle 
	implements 
		ApplicationContextAware, //xyz Aware
		BeanNameAware
{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext appContext;

	@Override
	public void setApplicationContext(ApplicationContext  appContext) throws BeansException {
		this.appContext = appContext;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name = "+beanName);
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