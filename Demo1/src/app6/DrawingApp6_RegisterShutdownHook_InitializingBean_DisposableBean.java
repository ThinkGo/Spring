package app6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp6_RegisterShutdownHook_InitializingBean_DisposableBean {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(".\\app6\\spring.xml");
		applicationContext.registerShutdownHook();
		Triangle t = (Triangle) applicationContext.getBean("triangle");
		t.draw();
	}
}
