package app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(".\\app2\\springApp2.xml");
		Triangle t = (Triangle) applicationContext.getBean("triangle");
		t.draw();

		//using alias
		System.out.println("\nUsing Alias ");
		t = (Triangle) applicationContext.getBean("triangle-alias");		
		t.draw();
	}
}
