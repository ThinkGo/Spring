package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp3AutoWire_ByNameAnd_CustomInit_DestroyMethods {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(".\\app3\\spring.xml");
		
		Triangle t =  (Triangle) applicationContext.getBean("triangle");
		t.draw();
	}
}
