package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.people.Person1;
import peaksoft.people.Person2;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person1 adilet = context.getBean("person1", Person1.class);
        System.out.println(adilet + "\n" + adilet.getAnimal());
        adilet.favoritAnimal();

        Person2 arlen = context.getBean("person2", Person2.class);
        System.out.println( "\n\n" + arlen + "\n" +arlen.getAnimal());
        arlen.favoriteAnimal();

        context.close();
    }
}
