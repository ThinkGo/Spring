package app7;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Triangle implements BeanPostProcessor

{
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {

		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {
	}

	public void draw() {
		System.out.println(pointA + " - " + pointB + " - " + pointC);
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
		Map a=new HashMap();
		a.put("aa", "BB");

	}
}
class A {
	static String A = "A";

	public static <E> void main(String[] args) {
		
		//----
		Set<E> s;
		Deque<E> d;
		LinkedList<E> ll;
		Stack<E> ss;
		//----
		
		int month = 2;
		int year = 2000;
		int numDays = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		default:
			System.out.println("Invalid month.");
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		}
		System.out.println("Number of Days = " + numDays);

		B b = new B();
		System.out.println(A);
		System.out.println(b.A);
	}
}

interface C {
	abstract void m();
}

class B extends A {
	static String A = "B";

}