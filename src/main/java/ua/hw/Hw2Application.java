package ua.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Hw2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");

		System.out.println("\n-----------------------\n");

		Performer performer = (Performer)context.getBean("student");
		performer.perform();

        System.out.println("\n-----------------------\n");

		Performer performer1 = (Performer)context.getBean("lazyStudent");
		performer1.perform();

        System.out.println("\n-----------------------\n");

		Performer performer2 = (Performer)context.getBean("person");
		performer2.perform();

        System.out.println("\n-----------------------\n");

        Performer performer3 = (Performer)context.getBean("extendedPerson");
        performer3.perform();

        System.out.println("\n-----------------------\n");

    }
}

