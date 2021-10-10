package springpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springpc/beans.xml");
		ComputerDaoImpl impl = (ComputerDaoImpl) context.getBean("CDI");
		Computer c1 = new Computer(1, "WD_Green 500GB", 2300, "B450-M2_PRO", 4200, "Ryzen 3 3200G", 6900, "HyperX 3200HZ 16GB", 2800);
		impl.addItem(c1);
	}
}
