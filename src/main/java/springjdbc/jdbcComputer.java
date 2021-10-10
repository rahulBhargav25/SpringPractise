package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcComputer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc/beans.xml");
		ComputerDaoImpl daoImpl = (ComputerDaoImpl) context.getBean("CDI");
//		Computer c1 = new Computer(1, "B450-M2 PRO", "WD-Green 500GB", "HyperX 16GB", "Ryzen 9 3200g", "GTX-1030");
//		daoImpl.buildPC(c1);
		
		System.out.println(daoImpl.getInfo());
	}
}
