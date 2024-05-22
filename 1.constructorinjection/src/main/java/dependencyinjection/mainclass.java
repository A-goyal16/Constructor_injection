package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainclass {
  public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	Employee emp=(Employee) context.getBean(Employee.class);
	System.out.println(emp);
}
}
