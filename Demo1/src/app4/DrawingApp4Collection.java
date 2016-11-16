package app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp4Collection {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(".\\app4\\spring.xml");
		
		System.out.println("list in spring bean referenced");
		Triangle t =  (Triangle) applicationContext.getBean("triangle");
		t.draw();
	}
}
