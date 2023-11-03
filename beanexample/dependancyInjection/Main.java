package dependancyInjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
        Person person =con.getBean(Person.class);
        person.speak();
    }
}
