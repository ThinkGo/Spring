package app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp5BeanScopes_X_Aware {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(".\\app5\\spring.xml");
		
		//Singleton - one per spring container. //default
		//prototype created for every request/response
		//applicationContext aware 
		Triangle t =  (Triangle) applicationContext.getBean("triangle");
		t.draw();
	}
}
