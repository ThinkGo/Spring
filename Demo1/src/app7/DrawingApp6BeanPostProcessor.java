package app7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp6BeanPostProcessor {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(".\\app7\\spring.xml");
		appContext.registerShutdownHook();
		Triangle t = (Triangle) appContext.getBean("triangle");
		t.draw();
	}
}
