package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vehicles.Vehicle;


public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle myCar = (Vehicle) context.getBean("myCar");
        myCar.crankIgnition();
    }

}
