package springpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springpractise/beans.xml");
		Computer c1 = (Computer) context.getBean("computer1");
		c1.displayComputer();
		System.out.println("here");
		
		
	}
}
