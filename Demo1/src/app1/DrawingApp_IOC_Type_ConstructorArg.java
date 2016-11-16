package app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp_IOC_Type_ConstructorArg {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(".\\app1\\springApp1.xml");
		Triangle bean = (Triangle) applicationContext.getBean("triangle");
		bean.draw();
	}
}